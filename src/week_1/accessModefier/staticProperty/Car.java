package week_1.accessModefier.staticProperty;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCar;
    public Car(String name, String engine){
        this.name = name;
        this.engine = engine;
        numberOfCar++;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engine=' " + engine + '\'' + " numberOfCar= " +
                numberOfCar +
                '}';
    }

    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3", "Skyactiv 3");
        int car = Car.numberOfCar = 5;
        System.out.println(car1);
        Car car2 = new Car("Mazda 6","Skyactiv 6");
        System.out.println(car2);
    }
}
