package nhiemVuDuocGiao.abstractt;

abstract class Geometric {
    abstract double area();

    abstract double perimeter();
}
    class Circle extends Geometric{
        double radius;
        Circle(double radius){
            this.radius = radius;
        }
        @Override
        double area() {
            return Math.PI * radius * radius;
        }
        @Override
        double perimeter() {
            return 2* radius *Math.PI ;
        }
        public void display(){
            System.out.printf("Area is: %.2f \n", area());
            System.out.printf("Perimeter is : %.2f", perimeter());
        }
    }

