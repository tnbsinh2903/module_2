package Array;

import java.util.Scanner;

public class Count_quantity_student_pass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 5)
                System.out.println("Size should not exceed 30");
        } while (size > 5);
        int[] arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.println("Enter a point for student " + i + ": ");
            arr[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        System.out.println("List point of student: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j] + "\t");
            if (arr[j] >= 5 && arr[j] <= 10)
                count++;
        }
        System.out.println(" Point of students passing the exam is: " + count);
    }
}
