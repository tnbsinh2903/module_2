package array;

public class FindMinMethod {
    public static void main(String[] args) {
       int[] arr = {4,12,6,9,2,7};
       int min = minValue(arr);
        System.out.println("The smallest element in array is: " + arr[min]);
    }
    public static int minValue(int[] arr){
        int min = arr[0];
        for (int i = 0; i< arr.length;i++){
            if(arr[i] < min)
                min = i;
        }
        return min;
    }

}
