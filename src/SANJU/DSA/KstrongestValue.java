package SANJU.DSA;

import java.util.*;

public class KstrongestValue {

        public int[] getStrongest(int[] arr, int k) {
            Arrays.sort(arr);
            int n= arr.length;
            int m= arr[(n-1)/2];
            int [] nums= new int[k];
            int left=0;
            int right= n-1;
            for(int i=0; i<k; i++){
                int leftdistance = Math.abs(arr[left]-m);
                int rightdistance= Math.abs(arr[right]-m);
                if(leftdistance>rightdistance){
                    nums[i]=arr[left];
                    left++;
                }else{
                    nums[i]= arr[right];
                    right--;
                }

            }
            return nums;

        }
    }

