package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Total_column {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[2][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("arr [" + i + "][" + j + "]= ");
                arr[i][j] = scanner.nextInt();
            }
        }
        // System.out.println(Arrays.deepToString(arr));
        int total_col = 0;
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                if (number == j) {
                    total_col += arr[i][j];
                }
            }
        }
        System.out.println(total_col);

    }
}
