package nhiemVuDuocGiao;
public class Student extends Person {
    Student(String name, int age, String course) {
        super(name, age, course);
    }
    public void address(){
        System.out.println("Hue city");
    }
    public static void main(String[] args) {
        Student student = new Student("Sinh", 22, "C0322G1");
        //student.getInfo();
        student.sayHi();
        student.address();
        System.out.println(student.name);
    }
}