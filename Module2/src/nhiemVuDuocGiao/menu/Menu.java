package nhiemVuDuocGiao.menu;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂ MENU ⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂");
            System.out.println("⁂⁂                                 ⁂⁂");
            System.out.println("⁂⁂      1. Quan Li Nguoi Dung      ⁂⁂");
            System.out.println("⁂⁂      2. Quan Li Banh            ⁂⁂");
            System.out.println("⁂⁂      3. Quan Li Đơn Hang        ⁂⁂");
            System.out.println("⁂⁂      0. Thoat                   ⁂⁂");
            System.out.println("⁂⁂                                 ⁂⁂");
            System.out.println("⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂");
            System.out.print("choose function: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("❀ ❀ ❀ ❀ ❀ USER MANAGER ❀ ❀ ❀  ❀ ❀");
                    System.out.println("❀ ❀                              ❀ ❀");
                    System.out.println("❀ ❀     1. Them nguoi dung       ❀ ❀");
                    System.out.println("❀ ❀     2. Sua thong tin user    ❀ ❀");
                    System.out.println("❀ ❀     3. Hien danh sach user   ❀ ❀");
                    System.out.println("❀ ❀     4. Quay lai              ❀ ❀");
                    System.out.println("❀ ❀                              ❀ ❀");
                    System.out.println("❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀");
                    break;
                case 2:
                    System.out.println("❀ ❀ ❀ ❀   CAKE MANAGER   ❀ ❀ ❀ ❀ ");
                    System.out.println("❀ ❀                            ❀ ❀ ");
                    System.out.println("❀ ❀      1. Them banh          ❀ ❀ ");
                    System.out.println("❀ ❀      2. Ton Kho            ❀ ❀ ");
                    System.out.println("❀ ❀      3. Quay lai           ❀ ❀ ");
                    System.out.println("❀ ❀                            ❀ ❀ ");
                    System.out.println("❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ");
                    break;
                case 3:
                    System.out.println("❀ ❀ ❀ ❀     LIST USER     ❀ ❀ ❀ ❀ ");
                    System.out.println("❀ ❀                            ❀ ❀ ");
                    System.out.println("❀ ❀                            ❀ ❀ ");
                    System.out.println("❀ ❀                            ❀ ❀ ");
                    System.out.println("❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ");
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("choose false");
            }
        }
    }
}