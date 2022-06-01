package week_1.accessModefier.student;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student("sinh", "c0322g1");
        System.out.println(student.getName());
        System.out.println(student.getClasses());
        System.out.println(student);
    }
}