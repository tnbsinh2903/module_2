package loopInJava;

import java.util.Scanner;

public class So_nt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter Numbers : ");
        int numbers = scanner.nextInt();
        for (int i = 0; i < numbers; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
//                count++ ;
            }
        }
    }

    public static boolean isPrimeNumber(int n) {
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
