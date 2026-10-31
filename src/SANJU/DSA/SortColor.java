package SANJU.DSA;

public class SortColor {
    public void sortColorsMethod(int[] nums) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[j]<nums[i]){
                    int swap= nums[i];
                    nums[i]=nums[j];
                    nums[j]=swap;

                }
            }
        }

    }
}
