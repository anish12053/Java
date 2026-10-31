package SANJU.DSA;
import java.util.*;
public class MissingandRepeating {

        public int[] findMissingRepeatingNumbers(int[] nums) {
            int [] arr= new int[2];
            HashMap<Integer,Integer> map= new HashMap<>();
            for(int i=0; i<nums.length; i++){
                if(map.containsKey(nums[i])){
                    map.put(nums[i], map.get(nums[i])+1);
                }else{
                    map.put(nums[i],1);
                }
            }
            for(int key:map.keySet()){
                if(map.get(key)==2){
                    arr[0]=key;
                }
            }
            int sum= nums.length*(nums.length+1)/2;
            for(int i=0; i<nums.length; i++){
                sum= sum-nums[i];

            }
            arr[1]=sum +arr[0];
            return arr;


        }
    }


