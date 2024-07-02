package easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args){
        int[] nums = {3,3,4};
        majorityElement(nums);
    }

    private static void majorityElement(int[] nums) {
        double max = (nums.length)/2;
        int number = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int n : nums){
            if(hm.containsKey(n))
                hm.put(n, hm.get(n)+1);
            else
                hm.put(n, 1);
        }
        for(Map.Entry<Integer, Integer> key : hm.entrySet()){
            if(key.getValue()>max){
                max = key.getValue();
                number = key.getKey();
            }

        }
        System.out.println(number);
    }
}
