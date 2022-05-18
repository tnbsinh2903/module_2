package Array;

import java.util.Scanner;

public class FindMaxArrayTwo_way {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows, column;
        System.out.print("nhập row của mảng = ");
        rows = scanner.nextInt();
        System.out.print("nhập col của mảng = ");
        column = scanner.nextInt();
        int[][] arr = new int[rows][column];
        System.out.println("nhập phần tử mảng:" + "\n");
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < column; col++) {
                System.out.print("arr[" + row + "][" + col + "] = ");
                arr[row][col] = scanner.nextInt();
            }
        }
//        int[][] arr = {{2, 3, 4, 5}, {6, 7, 8, 9}};
//        int x = 0;
//        int y = 0;
                int max = arr[0][0];
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[i].length; j++) {
                        if (max < arr[i][j])
                            max = arr[i][j];
                    }
                }
        System.out.println("giá trị lớn nhát trong mảng là: " + max);
    }

}
//        for (int[] ac:arr)
//           System.out.println(Arrays.toString(ac));