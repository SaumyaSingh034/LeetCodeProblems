package sortingAlgo;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args){
        int arr[] = {8,4,2,1,3};
        insertionSort(arr);
    }

    private static void insertionSort(int[] arr) {

        for(int i=1;i< arr.length;i++){
            int current = arr[i]; //current = 4
            int j = i-1; //0
            while(j>=0 && arr[j]>current){
                arr[j+1] = arr[j]; // arr[1] = 8
                j--;
            }
            arr[j+1] = current;
        }
        System.out.println(Arrays.toString(arr));
    }
}
