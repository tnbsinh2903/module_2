package week_1.introduction_To_Java;

public class Btap {
    public static void main(String[] args) {
        int[] arr = new int[] {1,5,4,8,22,9,2};
        int min=0;
        for(int i = 0;i < arr.length;i++) {
            if (arr[i] % 2 == 0)
                min=arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] < min){
                min = arr[i];
            }
        }
        if(min==0){
            System.out.println("mảng không có số chẵn");
        }
        else {
        System.out.println("số chắn bé nhất trong mảng là: " + min);
        }
//        int min=Integer.MAX_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0 && arr[i] < min){
//                min = arr[i];
//            }
//        }
//        if(min==Integer.MAX_VALUE){
//            System.out.println("mảng không có số chẵn");
//        }
//        else {
//            System.out.println("số chắn bé nhất trong mảng là: " + min);
//        }

    }
}
