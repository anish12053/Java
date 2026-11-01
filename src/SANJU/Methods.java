package SANJU;

public class Methods {
    // Q1

    public void printMultiplicationTable(int n){
        for(int i=1; i<=10; i++){
            System.out.println(i*n);
        }
    }
 //Q2
    public void printPattern(int m) {
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
//Q3
        public int sumOfNaturalNumberUsingRecursion(int n){
            if(n==1){
                return 1;
            }
            return n+sumOfNaturalNumberUsingRecursion(n-1);

        }

        //Q3 iterative

    public void sumOfNaturalNumberUsingIterative(int m) {
        int sum = 0;
        for (int i = 1; i <= m; i++) {
            sum = sum + i;

        }
        System.out.println(sum);
    }

        // Q4
        public void printPatternQ4(int n) {
            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        public void findAvg(int... arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
        }
        System.out.println(sum/arr.length);

            }

            public float convert(float f){
         return f*1.8F+32f;
            }

    }


