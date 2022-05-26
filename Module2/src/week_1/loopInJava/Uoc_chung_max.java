package week_1.loopInJava;

import java.util.Scanner;

public class Uoc_chung_max {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập a: ");
        a = scanner.nextInt();
        System.out.println("nhap b: ");
        b = scanner.nextInt();
        a= Math.abs(a);
        b = Math.abs(b);
        if(a==0||b==0) {
            System.out.println("no greatest common factor");
        }
        while (a!=b){
            if(a>b)
                a = a-b;
            else
                b= b-a;
        }
        System.out.println("Greatest common factor: " + a);
    }
}
