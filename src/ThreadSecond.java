public class ThreadSecond implements Runnable{

    @Override
    public void run() {
        System.out.println("Inside main thread");
    }

    public static void main(String[] args){
        Thread obj = new Thread(){
            @Override
            public void run(){
                System.out.println("Thread1");
                System.out.println("Thread1");
                System.out.println("Thread1");
                System.out.println("Thread1");
                System.out.println("Thread1");
            }
        };
        Thread obj2 = new Thread(){
            @Override
            public void run() {
                System.out.println("123279173");
            }
        };

        obj.start();
        obj2.start();
    }
}
