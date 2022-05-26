package  week_1.array;

import java.util.Scanner;

public class FindMaxArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 5)
                System.out.println("Size should not exceed 5");
        } while (size > 5);
        int[] arr = new int[size];
        for (int i = 0; i< arr.length; i++) {
            System.out.println("Enter element " + i + " :");
            arr[i] = scanner.nextInt();
        }
        System.out.println("List property");
        for (int j = 0 ; j < arr.length ; j++){
            System.out.println(arr[j]);
        }
        int max = arr[0];
        int index=0;
        for( int i = 0 ; i< arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
                index = i;
            }
        }
            System.out.println("The property value in list is: " + max + " position is:  " + index);

     }

}
