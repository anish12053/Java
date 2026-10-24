package DAL;

public class LoopPractise {
    public void printPattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printPatternUsingWhileLoop(int n){
        int i=0;
        while(i<n){
            int j=0;
            while(j<n-i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

    }

    public long sumFirstNEvenNumber(int n){
        long sum = 0;
        for(int i=1;i<=n;i++){
            sum += i*2;
        }
        return sum;
    }

    public long sumFirstNEvenNumberUsingWhile(int n){
        long sum = 0;
        int i=1;
        while(i<=n){
            sum += i*2;
            i++;
        }
        return sum;
    }

    public long sumFirstNEvenNumberUsingWhileLoop(int n){
        long sum = 0;
        int i=1;
        while(i<=n){
            sum += i*2;
            i++;
        }
        return sum;
    }

    public void tableOfN(int n){
        int i=1;
        while(i<=10){
            System.out.println(n*i);
            i++;
        }
    }

    public void reverseTableOfN(int n){
        int i=10;
        while(i>0){
            System.out.println(n*i);
            i--;
        }
    }

    public long factorial(int n){
        if(n==0 || n==1) return 1;
        long fact = 1;
        for(int i=2;i<=n;i++){
            fact *= i;
        }
        return fact;
    }

    public long factorialUsingWhileLoop(int n){
        if(n==0 || n==1) return 1;
        long fact = 1;
        int i=2;
        while(i<=n){
            fact *= i;
            i++;
        }
        return fact;
    }

    public long sumOfTableOfNumber(int n){
        int ans = 0;
        for(int i=1;i<10;i++){
            ans += n*i;
        }
        return ans;
    }
}
