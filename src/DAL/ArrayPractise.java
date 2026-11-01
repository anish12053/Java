package DAL;

public class ArrayPractise {

    public float sumOfArray(float[] arr){
        float sum = 0;
        for (float v : arr) {
            sum += v;
        }
        return sum;
    }

    public boolean findNumberInArray(float[] arr, float num){
        for(float n : arr){
            if(n==num) return true;
        }
        return false;
    }

    public float findAverageOfArray(float[] arr){
        float sum = 0;
        for(float n : arr){
            sum += n;
        }
        return sum / arr.length;
    }

    public void sumOfMatrix(int[][] num1, int[][] num2){
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print((num1[i][j] + num2[i][j]) + " ");
            }
            System.out.println();
        }
    }

    public void reverseArray(float[] num){
        int i=0, n=num.length;
        while(i<n){
            float temp = num[n-1];
            num[n-1] = num[i];
            num[i] = temp;
            i++;
            n--;
        }
        // not printing here to verify the original array has changes not a copy
    }

    public float maximum(float[] num){
        float max = Integer.MIN_VALUE;
        for(float n : num){
            if(max < n){
                max = n;
            }
        }
        return max;
    }

    public float minimum(float[] num){
        float min = Integer.MAX_VALUE;
        for(float n : num){
            if(min > n){
                min = n;
            }
        }
        return min;
    }

    public boolean checkSorted(float[] num){
        for(int i=0;i<num.length-1;i++){
            if(num[i] > num[i+1]) return false;
        }
        return true;
    }

}
