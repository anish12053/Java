package Utils.Thread;

public class Morning extends Thread{
    public void run(){
        int i=0;
        while(i<10){
            System.out.println("Good Morning");
            if(i==5) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            i++;
        }
    }
}
