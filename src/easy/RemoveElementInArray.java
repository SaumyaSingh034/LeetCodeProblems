package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveElementInArray {


    public static void main(String[] args) {
        int nums[] = {2, 4, 5, 6, 2, 2, 3, 1};
        int val = 2;
        System.out.println( removeElement(nums, val));
        int nums2[] = {3, 2, 2, 3};
        int val2 = 3;
        System.out.println( removeElement(nums2, val2));
        int nums3[] = {0, 1, 2, 2, 3, 0, 4, 2};
        int val3 = 2;
        System.out.println( removeElement(nums3, val3));
    }

    /*
    int[] nums = [...]; // Input array
    int val = ...; // Value to remove
    int[] expectedNums = [...]; // The expected answer with correct length.
                            // It is sorted with no values equaling val.

    int k = removeElement(nums, val); // Calls your implementation

    assert k == expectedNums.length;
    sort(nums, 0, k); // Sort the first k elements of nums
    for (int i = 0; i < actualLength; i++) {
    assert nums[i] == expectedNums[i];
}
     */
    private static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count]=nums[i];
                count++;
            }
        }
        return count;

    }
}
