package SANJU.DSA;
import java.util.*;

public class FourSum {

        public List<List<Integer>> fourSum(int[] nums, int target) {
            List<List<Integer>>list= new ArrayList<>();
            int n= nums.length;
            Arrays.sort(nums);
            for(int i=0; i<nums.length; i++){
                if(i>0 && nums[i]==nums[i-1]){ //skip duplicate for  nums[i]
                    continue;
                }
                for(int j=i+1; j<nums.length; j++){
                    if(j>i+1 && nums[j]==nums[j-1]){
                        // skip duplicate for nums[j]
                        continue;
                    }
                    // two pointer
                    int p=j+1;
                    int q=n-1;
                    while(p<q){
                        long sum= (long)nums[i]+nums[j]+nums[p]+nums[q];
                        if(sum<target){
                            p++;
                        }else if(sum>target){
                            q--;
                        }else{
                            list.add(Arrays.asList(nums[i],nums[j],nums[p],nums[q]));
                            p++;
                            q--;
                            while(p<q && nums[p]==nums[p-1]){// skip duplicate for nums[p]
                                p++;
                            }
                            while(p<q && nums[q]==nums[q+1]){ // skip duplicate for nums[q]
                                q--;
                            }
                        }
                    }

                }
            }

            return list;
        }
    }

