package sortingAlgo;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args){
        int arr[] = {8,4,2,1,3};
        selectionSort(arr);
    }

    private static void selectionSort(int[] arr) {

        for(int i=0;i< arr.length;i++){
            int min_index = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_index]){
                    min_index = j;
                }
            }
            int lowestNumber = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = lowestNumber;
        }
        System.out.println(Arrays.toString(arr));

    }
}
