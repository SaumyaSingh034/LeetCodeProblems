package medium;

import java.util.HashMap;

public class SingleNumber2 {
    public static void main(String[] args){
        int[] nums = {2,2,3,2};
        System.out.println(singleNumber(nums));
    }

    private static int singleNumber(int[] nums) {
        int num;
        HashMap<Integer, Integer> hm =new HashMap<>();
        for(int n : nums) {
            if(hm.containsKey(n))
                hm.put(n, hm.get(n)+1);
            else
                hm.put(n, 1);
        }
        for(int key: hm.keySet()){
            if(hm.get(key) == 1)
                return key;
        }
        return 0;
    }
}
