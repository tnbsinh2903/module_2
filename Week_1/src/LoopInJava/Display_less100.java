package LoopInJava;

import java.util.Scanner;

public class Display_less100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 100; i++) {
            if (isPreme(i))
                System.out.println(i);
        }
    }

    public static boolean isPreme(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}