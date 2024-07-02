package easy;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;

        merge(nums1, m, nums2, n);
    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = m + n;
        for (int j = 0, i = m; j < n; j++) { // 1,2,3,0,0,0
            nums1[i] = nums2[j];//m=3 nums1[3] = nums2[0]
            i++;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
