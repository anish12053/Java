package Utils.Thread;

public class ThreadRun {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Welcome();
        Thread t2 = new Morning();
        t1.start();
        t2.start();
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        t1.setPriority(1);
        System.out.println(t1.getPriority());
        t1.join();
        System.out.println(t1.getState());

//        Thread.currentThread()
    }

}
