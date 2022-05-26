package week_1.opp;

import java.util.Scanner;

public class QuadraticEquation {
    private final double a, b, c;

    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - (4 * a * c);
    }

    public double getRoot1() {
        if (this.getDiscriminant() < 0) return 0;
        return (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c) / (2 * a));
    }

    public double getRoot2() {
        if (this.getDiscriminant() < 0) return 0;
        return (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c) / (2 * a));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() < 0)
            System.out.println("The equation has no solution");
        else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("The The equation has 1 solutions: " + (-b / 2 * a));
        } else {
            System.out.print("The equation has 2 solution : ");
            System.out.println("Delta is: " + quadraticEquation.getDiscriminant());
            System.out.println("Solution is: " + quadraticEquation.getRoot1());
            System.out.println("Solution is: " + quadraticEquation.getRoot2());
        }
    }
}

