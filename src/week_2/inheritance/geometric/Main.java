package week_2.inheritance.geometric;

public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        square = new Square(3.5);
        System.out.println(square);
        square = new Square(5.8, "yellow", true);
        System.out.println(square);
    }
}
