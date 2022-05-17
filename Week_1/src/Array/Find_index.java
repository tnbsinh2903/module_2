package Array;

import java.util.Objects;
import java.util.Scanner;

public class Find_index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] students = {"sinh", "bao", "tran", "nguyen"};
        System.out.println("Enter a name's student: ");
        String nameStudent = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i < students.length; i++) {
            if (nameStudent.equals(students[i])) {
                System.out.println("Position of the student in array " + nameStudent + " is " + i);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Not found " + nameStudent + " in array");
        }
    }
}

