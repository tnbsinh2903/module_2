package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Diagonal_main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("nhập vào mảng " + i + " và " + j + " =");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.print(Arrays.deepToString(arr));
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i] == arr[j])
                    sum += arr[i][j];
            }
        }
        System.out.println("\n" + sum);
//        for ( int ac:arr) {
//
//        }
//        System.out.print(Arrays.deepToString(arr));

    }
}
