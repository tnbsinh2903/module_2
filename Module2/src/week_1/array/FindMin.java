package  week_1.array;

import java.util.Arrays;
import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i< size;i++){
            System.out.print("arr [" + i + "] = ");
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        for (int i = 0 ; i< arr.length;i++){
            if(min > arr[i])
                min = arr[i];
        }
        System.out.println(min);
    }
}
