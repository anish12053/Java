package SANJU;

public class Arrays {
 public void floatCalculateSum(float [] arr){
  float sum=0;
  for(int i=0; i<arr.length; i++){
      sum=sum+arr[i];
      System.out.println(sum);

  }
 }

 //Q2
  public int findIntegerPresent(int [] nums ,int number ){
     for(int i=0; i<nums.length; i++){
         if(nums[i]==number){
             return nums[i];

         }
     }
     return -1;


  }
  //Q3

  public void calculateAvgMarks(int [] marks){
     int sum=0;
     for(int i=0; i<marks.length; i++){
         sum=sum+marks[i];
     }
     System.out.println(sum/marks.length);

  }

//Q4
    public void sumOfMatrices( int [] []mat1 , int [][] mat2){
     int[][] sum= new int[2][3];
     for(int i=0; i<2; i++){
         for(int j=0; j<3; j++){
             sum[i][j]=mat1[i][j]+mat2[i][j];

         }
     }
for(int i=0; i<2; i++){
    for(int j=0; j<3; j++){
        System.out.print(sum[i][j] + " ");
    }
    System.out.println();
}

    }

    //Q5
    public void reverseArray(int [] arr1){

     int start=0;
     int end= arr1.length-1;
     while(start<end){
         int temp= arr1[start];
         arr1[start]=arr1[end];
         arr1[end]=temp;
         start++;
         end--;
     }
     for(int i=0; i<arr1.length;i++){
         System.out.println(arr1[i]);
     }


    }

    //Q6
    public int  maximumElement(int[] element){
     int max=element[0];
     for(int i=0; i<element.length; i++) {
         if (element[i] > max) {
             max = element[i];
         }
     }
         return max;
     }


// Q7
    public void minmumElement(int [] value){
     int min= value[0];
     for(int i=0; i<value.length; i++){
         if(value[i]<min){
             min=value[i];
         }
     }
     System.out.println(min);
    }
 //Q8
    public boolean findSortArray(int [] sort){
     for(int i=0; i<sort.length-1; i++){
         if(sort[i]>sort[i+1]){
             return false;

         }


     }
        return true;

    }


}
