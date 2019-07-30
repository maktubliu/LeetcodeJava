public class Foo{
    private boolean firstFinished;
    private boolean secondFinished;
    private Object lock = new Object();
    public Foo(){

    }
    public void first(Runnable printFirst) throws InterruptedException{
        synchronized(lock){
            printFirst.run();
            firstFinished = true;
            lock.notifyAll();
        }
    }

    public void second(Runnable printSecond) throws InterruptedException{
        synchronized(lock){
            while(!firstFinished){
                lock.wait();
            }
            printSecond.run();
            secondFinished = true;
            lock.notifyAll();
        }
    }
    public void third(Runnable printThird) throws InterruptedException{
        synchronized(lock){
            while(!secondFinished){
                lock.wait();
            }
            printThird.run();
        }
    }
}