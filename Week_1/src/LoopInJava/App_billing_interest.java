package LoopInJava;

import java.util.Scanner;

public class App_billing_interest {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner scanner = new Scanner(System.in);
        //System.out.println("(investment_amount)nhập vào số tiền gửi:");
        money = scanner.nextDouble();
        //System.out.println("nhập vào số tháng muốn gửi:");
        month = scanner.nextInt();
        //System.out.println("nhập vào lãi suất muốn gửi: ");
        interestRate = scanner.nextDouble();
        double totalInterest = 0;
        //for (int i = 0; i< month;i++) {
            totalInterest = money * (interestRate / 100) / 12 * month;
        //}
        System.out.println(totalInterest);
    }
}
