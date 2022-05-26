package nhiemVuDuocGiao;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 9, -2, 5, -9, 3, 0};
        for( int i = 0; i< arr.length -1; i++){
            for(int j = 0; j< arr.length -i -1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
        System.out.println("Mảng khi đã sắp xếp: " + Arrays.toString(arr));
    }
}
