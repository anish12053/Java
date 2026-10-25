package SANJU;

public class Conditions {

    public void Age( ) {

        int a = 10;
        if (a == 11) {
            System.out.println("i am 11");
        } else {
            System.out.println("i am not 11");

        }
    }

 public void  number(int sub1, int sub2, int sub3){
            int total= sub1+sub2+sub3;
            double  totalprecentage = total/300*100;
            if(sub1>=33 && sub2>=33 && sub3>=33 && totalprecentage>=40){
                System.out.println("pass");

            }else{
                System.out.println("fail");
            }
        }


    }

