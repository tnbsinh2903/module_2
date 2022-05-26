package week_1.opp;

public class Person {
    int age = 22;
    String name = "sinh";
    void greeting() {
        System.out.println("hello world!");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Name: " + person.name);
        System.out.println("Age : " + person.age);
        System.out.println("sum: " + person.sum(5, 5));
        person.greeting();
    }
}
