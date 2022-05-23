package NhiemVuDuocGiao;

import java.util.Scanner;

public class BoiChungNhoThat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.print("nhập vào sô a: ");
        a = scanner.nextInt();
        System.out.print("nhập vào số b: ");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        System.out.println("ước chung lớn nhất của: " + a + " và " + b + " là: " + ucln(a, b));
        System.out.println("bội chung nhỏ nhất của: " + a + " và " + b + " là: " + bcnn(a, b));
    }

    public static int ucln(int a, int b) {
        if (a == 0 || b == 0) {
            System.out.println("no greatest common factor");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }

    public static int bcnn(int a, int b) {
        return (a * b) / ucln(a, b);
    }
}


