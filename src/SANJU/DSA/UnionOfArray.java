package SANJU.DSA;
import java.util.*;

public class UnionOfArray {
    public int[] unionArray(int[] nums1, int[] nums2) {
        HashSet<Integer>set= new HashSet<>();
        for(int i=0; i<nums1.length; i++){
            set.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++){
            set.add(nums2[i]);
        }

        ArrayList<Integer>list = new ArrayList<>();
        for(int num : set){
            list.add(num);
        }
        Collections.sort(list);
        int [] arr= new int[list.size()];
        for(int i=0; i<list.size(); i++){
            arr[i]=list.get(i);

        }
        return arr;

    }
}
