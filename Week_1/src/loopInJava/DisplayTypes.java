package loopInJava;

import java.util.Scanner;

public class DisplayTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu:");
            System.out.println("\t 1. Print the rectangle.");
            System.out.println("\t 2. Print the square triangle.");
            System.out.println("\t 3. Print isosceles triangle");
            System.out.println("\t 0.Exit.");
            System.out.println("\t Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Print the rectangle");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Print the square triangle: ");
                    for (int i =0;i<=5;i++){
                        for (int j = 0; j<i;j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Print isosceles triangle: ");
                    for (int i = 5; i>=0;i--){
                        for (int j=0;j<i;j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice:");
            }
        }
    }
}