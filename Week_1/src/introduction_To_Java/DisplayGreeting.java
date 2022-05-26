package introduction_To_Java;

import java.util.Scanner;

public class DisplayGreeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String str = scanner.nextLine();
        System.out.println("Puppy: " + str);
    }
}
