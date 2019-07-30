class FooBar{
    private int n;
    private volatile int lock = 0; 
    public FooBar(int n){
        this.n = n;
        lock = n*2;
    }
    public void foo(Runnable printFoo) throws InterruptedException{
        for(int i = 0; i < n; i++){
            while(this.lock %2 == 1){

            }
            printFoo.run();
            this.lock--;
        }
    }
    public void bar(Runnable printBar) throws InterruptedException{
        for(int i = 0; i < n; i++){
            while(this.lock %2 == 0){

            }
            printBar.run();
            this.lock--;
        }
    }
}