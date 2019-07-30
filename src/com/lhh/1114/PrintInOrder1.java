import java.util.concurrent.CountDownLatch;

public class Foo{
    private CountDownLatch countDownLatchA;
    private CountDownLatch countDownLatchB;
    public Foo(){
        countDownLatchA = new CountDownLatch(1);
        countDownLatchB = new CountDownLatch(1);
    }
    public void first(Runnable printFirst) throws InterruptedException{

        printFirst.run();
        countDownLatchA.countDown();
    }
    public void second(Runnable printSecond) throws InterruptedException{
        countDownLatchA.await();
        printSecond.run();
        countDownLatchB.countDown();
    }
    public void third(Runnable printThird) throws InterruptedException{
        countDownLatchB.await();
        printThird.run();
    }
}