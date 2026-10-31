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

        public void week(int day){

            switch(day){
            case 1:
            System.out.println("Monday");
            break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;

                default:
                    System.out.println("Invalid day");
        }
        }
        public void website(String web){
        if(web.endsWith(".com")){
            System.out.println("commercial website");
        }else if(web.endsWith(".org")){
            System.out.println("Organisation website");
        }else{
            System.out.println("Indian website");
        }

        }
    }

