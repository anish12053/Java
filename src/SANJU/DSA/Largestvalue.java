package SANJU.DSA;

class Solution {
    public int largestElement(int[] nums) {
        int val= nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i]>val){
                val=nums[i];
            }
        }
        return val;
    }
}

