package lesson5;

public class Main {
    public static void main(String[] args) {

        //  MyThread t1=new MyThread("t1");
        //MyThread t2=new MyThread("t2");
        //   t1.start();
        //  t2.start();
        //  t1.run();
        //  t2.run();

      // Thread t1 = new Thread(new MyRunnable());
        //Thread t2 = new Thread(new MyRunnable());
        //t1.start();
        //t2.start();
       Thread t1 = new Thread(new Runnable() {
           @Override
           public void run() {
               for (int i=0;i<10;i++){
                   System.out.println(i + " "+ Thread.currentThread().getName());
               }
           }
       });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                    System.out.println(i + " "+ Thread.currentThread().getName());
                }
            }
        });
       t1.start();
       t2.start();
    }
}