package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatefromSortedArray {

    public static void main(String[] args) {
        int nums[] = {1, 1, 2};
        System.out.println(removeDuplicates(nums));
        System.out.println(removeDuplicate(nums));
    }

    private static int removeDuplicates(int[] nums) {
        ArrayList<Integer> nums2 = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0;
        for (int num : nums) {
            if (hm.containsKey(num))
                hm.put(num, hm.get(num) + 1);
            else {
                hm.put(num, 1);
                count++;
            }
        }
        for(Map.Entry<Integer, Integer> k: hm.entrySet()) {
            if(k.getValue() >= 1){
               if(nums2.contains(k.getKey())){
                   nums2.add(Integer.parseInt("_"));
               }else{
                   nums2.add(k.getKey());
               }
            }
        }

       return count;
    }

    public static int removeDuplicate(int[] nums){
        int n=nums.length;
        int j=0;
        for(int i=1;i<n;i++)
        {
            if(nums[j]!=nums[i]){
                nums[j+1]=nums[i];
                j++;
            }
        }
        return j+1;
    }
}
