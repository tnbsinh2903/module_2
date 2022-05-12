package nháp;

public class Total {
    public static void main(String[] args) {
        int i = 5;
        int j = 6;
        int k = i + j;
        System.out.println(
                " the maxium of " + i +
                        " and " + j + " is " + k
        );
    }
    public static int max (int num1, int num2) {
        int result ;
        if (num1 > num2)
            result = num1;
            else
                result = num2;
            return result;
        }
    }

