package SANJU;

public class Loops {
    public void Pattern(int n){
    for (int i=n; i>=1; i--) {
        for (int j = 1; j <= i; j++) {
            System.out.print(" * ");
        }
        System.out.println();
    }

    }

    public void Evennumber(int n){
//        int sum= n*(n+1);
//        System.out.println(sum);
        int sum=0;
        int i=1;
        while(i<=n){
            sum=sum+(i*2);
            i++;
        }
        System.out.println(sum);
    }

    public void Table(int n){
        for(int i=1; i<=10; i++){
            System.out.println( i*n);
        }
    }

    public void reverseTable(int n){
        for(int i=10; i>=1; i--){
            System.out.println(i*n);
        }
    }
    public int factorial( int n){
        int number=1;
        for(int i=1; i<=n; i++){
             number=number*i;

        }
        return number;
    }
 public void factorialwhileloop(int n){
        int i=1;
        int number =1;
        while(i<=n){
            number=number*i;
            i++;
        }
        System.out.println(number);

 }
 public void summultiplication(int n){
        int sum=0;
        for(int i=1; i<=10; i++){
            sum=sum+n*1;
        }
        System.out.println(sum);
 }
    }

