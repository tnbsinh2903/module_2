package nhiemVuDuocGiao;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,9,1,5,-3,7};
         for (int i =0;i < arr.length-1;i++) {
             int minIndex = i;
             for (int j = i + 1; j < arr.length; j++) {
                 if (arr[j] < arr[minIndex])
                     minIndex = j;
             }
             int temp = arr[minIndex];
             arr[minIndex] = arr[i];
             arr[i] = temp;
         }
        System.out.println(Arrays.toString(arr));
    }
}