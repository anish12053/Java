package DAL;

public class MethodPractise {

    public void tableOfN(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }
    }

    public int sumOfNNaturalNumber(int n){
        if(n==1) return 1;
        return n + sumOfNNaturalNumber(n-1);
    }

    public int fibonacci(int n){
        if(n==0 || n==1) return 1;
        int a = 1;
        int b = 1;
        for(int i=2;i<=n;i++){
            int temp = b;
            b = a+b;
            a = temp;
        }
        return b;
    }

    public float average(int... num){
        int sum = 0;
        for(int i : num){
            sum+=i;
        }
        return (float)sum/num.length;
    }

    public float celsiusToFahrenheit(float num){
        return num*1.8f + 32f;
    }

    public int sumOfNNaturalNumberUsingIteration(int n){
        int sum =0;
        for(int i=1;i<=n;i++){
            sum += i;
        }
        return sum;
    }
}
