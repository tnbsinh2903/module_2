package Introduction_To_Java;

import java.util.Scanner;

public class Doc_so {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            int first = number / 100;
            int second = (number % 100) / 10;
            int third = number % 10;
            String result = null;
            if (number < 10) {
                result = One2Nice(third);
                System.out.println(result);
                return;
            }
            if (number >= 10 && number < 20) {
                result = Ten2Nineteen(second);
                System.out.println(result);
                return;
            }
            if (number > 19 && number <= 100) {
                if (third != 0) {
                    result = Twenty2_100(second) + " " + One2Nice(third);
                    System.out.println(result);
                } else {
                    result = Twenty2_100(second);
                    System.out.println(result);
                }
                return;
            }
            if (number >= 100 && number < 1000) {
                if (third == 0) {
                    if (second == 0) {
                        result = OneHundred_1000(first);
                        System.out.println(result);
                    }
                    if (second < 2 && second > 0) {
                        result = OneHundred_1000(first) + "  " + Ten2Nineteen(third);
                        System.out.println(result);
                    } else if (second >= 2) {
                        result = OneHundred_1000(first) + " " + Twenty2_100(second);
                        System.out.println(result);
                    }
                } else if (second == 0) {
                    result = OneHundred_1000(first) + "  " + One2Nice(third);
                    System.out.println(result);

                } else if (second < 2) {
                    result = OneHundred_1000(first) + "  " + Ten2Nineteen(third);
                    System.out.println(result);
                } else {
                    result = OneHundred_1000(first) + "  " + Twenty2_100(second) + "  " + One2Nice(third);
                    System.out.println(result);
                }
            }
    }

//    public static String Twenty2_100(int number) {
//        String number20_100 = null;


    public static String One2Nice(int number) {
        String numbers_1_9 = null;
        switch (number) {
            case 0:
                numbers_1_9 = "Zero";
                break;
            case 1:
                numbers_1_9 = "One";
                break;
            case 2:
                numbers_1_9 = "Two";
                break;
            case 3:
                numbers_1_9 = "Three";
                break;
            case 4:
                numbers_1_9 = "Four";
                break;
            case 5:
                numbers_1_9 = "Five";
                break;
            case 6:
                numbers_1_9 = "Six";
                break;
            case 7:
                numbers_1_9 = "Seven";
                break;
            case 8:
                numbers_1_9 = "Eight";
                break;
            case 9:
                numbers_1_9 = "Nine";
                break;
        }
        return numbers_1_9;
    }

    public static String Ten2Nineteen(int number) {
        String numbers_10_19 = null;
        switch (number) {
            case 0:
                numbers_10_19 = "Ten";
                break;
            case 1:
                numbers_10_19 = " Eleven";
                break;
            case 2:
                numbers_10_19 = "Twelve";
                break;
            case 3:
                numbers_10_19 = "Thirteen";
                break;
            case 4:
                numbers_10_19 = "Fourteen";
                break;
            case 5:
                numbers_10_19 = "Fifteen";
                break;
            case 6:
                numbers_10_19 = "Sixteen";
                break;
            case 7:
                numbers_10_19 = "Seventeen";
                break;
            case 8:
                numbers_10_19 = "Eighteen";
                break;
            case 9:
                numbers_10_19 = "Nineteen";
                break;
        }
        return numbers_10_19;
    }

    public static String Twenty2_100(int number) {
        String number20_100 = null;
        switch (number) {
            case 2:
                number20_100 = "Twenty";
                break;
            case 3:
                number20_100 = "Thirty";
                break;
            case 4:
                number20_100 = "Fourty";
                break;
            case 5:
                number20_100 = "Fivety";
                break;
            case 6:
                number20_100 = "Sixty";
                break;
            case 7:
                number20_100 = "Seventy";
                break;
            case 8:
                number20_100 = "Eighty";
                break;
            case 9:
                number20_100 = "Ninety";
                break;
        }
        return number20_100;
    }

    public static String OneHundred_1000(int number) {
        String OneHundred_1000 = null;
        switch (number) {
            case 1:
                OneHundred_1000 = "One hundred";
                break;
            case 2:
                OneHundred_1000 = "Two hundred";
                break;
            case 3:
                OneHundred_1000 = "Three hundred";
                break;
            case 4:
                OneHundred_1000 = "Four hundred";
                break;
            case 5:
                OneHundred_1000 = "Five hundred";
                break;
            case 6:
                OneHundred_1000 = "Six hundred";
                break;
            case 7:
                OneHundred_1000 = "Seven hundred";
                break;
            case 8:
                OneHundred_1000 = "Eight hundred";
                break;
            case 9:
                OneHundred_1000 = "Nine hundred";
                break;
        }
        return OneHundred_1000;
    }

}