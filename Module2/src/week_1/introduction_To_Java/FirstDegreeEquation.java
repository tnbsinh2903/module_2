package week_1.introduction_To_Java;

import java.util.Scanner;

public class FirstDegreeEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Linear Equation Réolver");
        System.out.println("Given a equation á 'a * x + b = c' please enter constants: ");
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        }else {
            if(b==c){
                System.out.println("The solution is all x1");
            }else {
                System.out.println("No solution!");
            }
        }
    }
}
