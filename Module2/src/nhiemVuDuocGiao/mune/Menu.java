package nhiemVuDuocGiao.mune;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.mainMenu();
    }
    Scanner bs = new Scanner(System.in);
    int number;
    void mainMenu(){
        System.out.println("⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂ MENU ⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂");
        System.out.println("⁂⁂                                 ⁂⁂");
        System.out.println("⁂⁂      1. Manager User            ⁂⁂");
        System.out.println("⁂⁂      2. Manager Cake            ⁂⁂");
        System.out.println("⁂⁂      3. Manager Order           ⁂⁂");
        System.out.println("⁂⁂      0. Exit                    ⁂⁂");
        System.out.println("⁂⁂                                 ⁂⁂");
        System.out.println("⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂");
        do {
            System.out.println("choose function: ");
            number= bs.nextInt();
            switch (number){
                case 1:
                    userManager();
                    break;
                case 2:
                    cakeManager();
                    break;
                case 3:
                    orderManager();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Number incorrect, PLEASE ! Enter retype !");
            }
        }while (number != 0);
    }
    void userManager(){
        System.out.println("⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂ USER ⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂");
        System.out.println("⁂⁂                                 ⁂⁂");
        System.out.println("⁂⁂      1. Add User                ⁂⁂");
        System.out.println("⁂⁂      2. Remove User             ⁂⁂");
        System.out.println("⁂⁂      3. Fix User                ⁂⁂");
        System.out.println("⁂⁂      4. Come Back               ⁂⁂");
        System.out.println("⁂⁂                                 ⁂⁂");
        System.out.println("⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂");
        do {
            System.out.println("Choose function:" );
            number = bs.nextInt();
            if (number == 4) {
                mainMenu();
            } else {
                System.out.println("Number incorrect, PLEASE ! Enter retype !");
            }
        }while (number!=4);
    }
    void cakeManager(){
        System.out.println("⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂ CAKE ⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂");
        System.out.println("⁂⁂                                 ⁂⁂");
        System.out.println("⁂⁂      1. Add Cake                ⁂⁂");
        System.out.println("⁂⁂      2. Remove Cake             ⁂⁂");
        System.out.println("⁂⁂      3. Fix Cake                ⁂⁂");
        System.out.println("⁂⁂      0. Come Back               ⁂⁂");
        System.out.println("⁂⁂                                 ⁂⁂");
        System.out.println("⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂");
        do {
            System.out.println("Choose function:" );
            number = bs.nextInt();
            if (number == 0) {
                mainMenu();
            } else {
                System.out.println("Number incorrect, PLEASE ! Enter retype !");
            }
        }while (number!=0);
    }
    void orderManager(){
        System.out.println("⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂ ORDER ⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂");
        System.out.println("⁂⁂                                 ⁂⁂");
        System.out.println("⁂⁂      1. Add Order               ⁂⁂");
        System.out.println("⁂⁂      2. Remove Order            ⁂⁂");
        System.out.println("⁂⁂      3. Fix Order               ⁂⁂");
        System.out.println("⁂⁂      5. Come Back               ⁂⁂");
        System.out.println("⁂⁂                                 ⁂⁂");
        System.out.println("⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂⁂");
        do {
            System.out.println("Choose function:" );
            number = bs.nextInt();
            if (number == 5) {
                mainMenu();
            } else {
                System.out.println("Number incorrect, PLEASE ! Enter retype !");
            }
        }while (number!=5);
    }
}
