package  week_1.array;

import java.util.Arrays;
import java.util.Scanner;

public class Gop_array {
    public static void main(String[] args) {
        int[] arr1 = new int[2];
        int[] arr2 = new int[4];
        int[] arr3 = new int[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("nhập vào phần tử mảng arr1: " + i);
            arr1[i] = scanner.nextInt();
        }
        for (int j = 0;j< arr2.length;j++){
            System.out.println("nhập phần tử mảng arr2: " + j);
            arr2[j] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        for (int i = 0 ; i < arr1.length;i++){
                arr3[i]=arr1[i];
        }
       for (int j = 0;j< arr2.length;j++){
            arr3[arr1.length+j]=arr2[j];
        }
        System.out.println(Arrays.toString(arr3));
    }
}
