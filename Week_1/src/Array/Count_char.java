package Array;

import java.util.Scanner;

public class Count_char {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "tran nguyen bao sinh".toLowerCase();
        System.out.print("nhập vào kí tự muốn tìm: ");
        String ch = scanner.nextLine().toLowerCase();
        if (ch.length() != 1){
            System.out.println("duy nhất 1 kí tự thôi ạ, please !");
        return;
    }
        int count = 0;
        for (int i =0; i<str.length();i++){
            if(str.charAt(i)==ch.charAt(0))
                count ++;
        }
        System.out.println(count);

    }
}
