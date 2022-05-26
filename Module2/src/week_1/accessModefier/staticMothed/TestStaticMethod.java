package week_1.accessModefier.staticMothed;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student student = new Student(23, "tran ");
        Student student1 = new Student(123,"bao ");
        Student student2 = new Student(345, "sinh ");
        student.display();
        student1.display();
        student2.display();
    }
}
