package week_2.abstractAndInterface.resizeable;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle("red", false, 3.6);
        System.out.println(circle);

        Circle c = new Circle();
        System.out.println(c.getRadius());
        c.resize(0.5);
        System.out.println(c.getRadius());

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(3.5,5,"red",false);
        System.out.println(rectangle);


        System.out.println("Pre-resize height: "+rectangle.getLength());
        System.out.println("Pre-resize width: "+rectangle.getWidth());
        rectangle.resize(0.5);
        System.out.println("After-resize height: "+rectangle.getLength());
        System.out.println("After-resize width: "+rectangle.getWidth());
    }
}
