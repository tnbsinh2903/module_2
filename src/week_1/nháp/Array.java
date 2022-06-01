package week_1.nháp;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[3][2];
//        System.out.println("enter " + matrix.length + " row and " +
//                matrix[0].length + " columns: ");
        int total = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.println("nhap so phan tu vao mang");
                matrix[row][column] = scanner.nextInt();
                // MANG radom;
                //matrix[row][column] = (int) (Math.random()*100);
                total += matrix[row][column];
                //System.out.print(matrix[row][column] + "");
            }
            //System.out.println();
        }
        //in ra mang
        System.out.println(Arrays.deepToString(matrix));
        //in ra phan tu trong mang;
        System.out.println(matrix[2][0]);
        //tong phan tu trong mang;
        System.out.println("tong cua phan tu la: " + total);

        //TÍNH TỔNG TỪNG CỘT;
//        for (int column = 0; column < matrix[0].length; column++) {
//            int totall = 0;
//            for (int row = 0; row < matrix.length; row++) {
//                totall += matrix[row][column];
//
//            }
//            System.out.println("sum of colums " + column + " is " + totall);
//        }

          // tìm dòng có tổng các phần tử lớn nhất;
//        int maxRow =0;
//        int indexOfMaxRow = 0;
//        for( int column = 0; column < matrix[0].length ;column++){
//            maxRow += matrix[0][column];
//        }
//        for( int row = 1; row < matrix.length;row++){
//           int totalOfMaxRow =0;
//           for(int column = 0; column < matrix[row].length; column++)
//               totalOfMaxRow += matrix[row][column];
//               if(totalOfMaxRow > maxRow){
//                   indexOfMaxRow = row;
//           }
//        }
//        System.out.println("row " + indexOfMaxRow + " has the maximum sum of " + maxRow);
    }
}
