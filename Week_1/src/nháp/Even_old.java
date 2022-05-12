package nháp;

import java.util.Scanner;

public class Even_old {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so nguyen = ");
        int n = scanner.nextInt();
        int check = isEvent(n);
        if(check==0) System.out.println(n + " là số chẵn");
        else
            System.out.println(n + " là số lẻ");
    }
        public static int isEvent ( int n){


        int flag = 1;
        if(n%2==0) {
            flag = 0;
        }
        return flag;
        }

    }

