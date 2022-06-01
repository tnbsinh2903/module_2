package nhiemVuDuocGiao;
public class Person {
    public String name;
    public int age;
    public String course;
    public Person(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }
    public void getInfo() {
        System.out.println("Name:" + this.name);
        System.out.println("Age:" + this.age);
        System.out.println("Course:" + this.course);
    }
    public void sayHi() {
        System.out.println("Hello-everybody");
    }
    public static void main(String[] args) {
        Person person = new Person("bao",22,"c0322g2");

    }
}

