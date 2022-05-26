package nhiemVuDuocGiao;

import java.util.Scanner;

public class BinarySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySort bs = new BinarySort();
        int[] arr = {2,5,9,25,37,51,55,62};
        System.out.print("nhập vào phần tử cần tìm vị trí: ");
        int x = scanner.nextInt();
        int result = bs.binarySearch(arr,x);
        if(result == -1)
            System.out.println("Phàn tử không tồn tại !");
        else
            System.out.println("Phần từ được tìm tháy ở vị trí: " + result);
    }
    public int binarySearch(int arr[], int x) {
        int length = arr.length - 1;
           int i = 0;
        while (i <= length) {
            int mid = (i + length) / 2;
            if (arr[mid] == x)
               return mid;
            if (arr[mid] < x)
                i = mid + 1;
            else
                length = mid - 1;
        }
        return  - 1;
    }

}
//static :Khi chúng ta khai báo một phương thức là static,
// chúng ta có thể gọi phương thức này hoặc truy cập phương thức
// này mà không cần tạo một đối tượng !

// void: Từ khóa void cho phép chúng ta tạo các phương thức
// mà không trả về giá trị nào.

// Access Modifer trong Java xác định phạm
// vi có thể truy cập của biến, phương thức, constructor hoặc lớp.