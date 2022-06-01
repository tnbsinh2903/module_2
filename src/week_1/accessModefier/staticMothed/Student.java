package week_1.accessModefier.staticMothed;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";
    public Student(int r, String n){
        this.rollno = r;
        this.name = n;
    }
    static void change(){
        college = "SINHDZ";
    }
    void display(){
        System.out.println(rollno + " " + name + college);
    }

    public static void main(String[] args) {
    }
}
