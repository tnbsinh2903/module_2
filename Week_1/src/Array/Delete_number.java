package Array;

import java.util.Arrays;

public class Delete_number {
    public static void main(String[] args) {
        int [] array = {3,5,6,8,1};
        int index_del = 2;
        for (int i = index_del; i < 4 ; i++) {
             array[i] = array[i + 1];

        }
//        for(int eleent : array){
//            System.out.println(eleent);}
        System.out.println(Arrays.toString(array));
    }
}
