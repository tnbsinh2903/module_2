package Introduction_To_Java;

import java.util.Scanner;

public class AppConvertMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd;
        System.out.println("Enter number money USD : ");
        usd = scanner.nextDouble();
        System.out.println("Usd To Vietnamese is: " + usd* 23000);
    }
}
