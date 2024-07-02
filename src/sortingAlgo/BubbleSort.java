package sortingAlgo;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args){
        int arr[] = {20,11,4,6,2,89,71,100,12};
        int arr1[] = {-1,2,-9,-8,0,-5,-0,6};
        int arr2[] = {12,12,12,13,12,12};
        int arr3[] = {89,99,1,2,99,99,99,1};
        int arr4[] = {8,9,1,0,-2,-1,-1,-2};
        bubbleSort(arr);
        bubbleSort(arr1);
        bubbleSort(arr2);
        bubbleSort(arr3);
        bubbleSort(arr4);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
    }

    private static void bubbleSort(int[] arr) {
        int temp;
        Boolean flag = false;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    flag = true;
                }
            }
            if(!flag || flag == false)
                break;
        }
    }
}
