package array;

import java.util.Arrays;

public class Add_number {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int X = 55;
        int index = 5;
        int[] temp = new int[10];
        for (int i = 0; i < temp.length; i++) {
            if(i<index)
                temp[i]=array[i];
            else if (i==index)
                temp[i]=X;
            else
                temp[i]= array[i-1];
        }
        System.out.println(Arrays.toString(temp));
//            int[] arr = {1,2,3,4,5,6,7,8,9};
//            int x = 10;
//            int index = 2;
//            int[] temp = new int[10];
//            for (int i = 0; i< temp.length;i++) {
//                if (i<index)
//                    temp[i]=arr[i];
//                else if (i==index)
//                    temp[i] = x;
//                else
//                    temp[i] = arr[i-1];
//            }
//            arr = temp;
//            System.out.println(Arrays.toString(arr));
    }
}
