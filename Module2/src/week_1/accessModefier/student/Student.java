package week_1.accessModefier.student;

public class Student {
   private String name = "Sinh";
   private String classes = "C0333G1";
//   public Student(String name, String classes){
//       this.name = name ;
//       this.classes = classes;
//   }
    public Student(String name, String classes){
        this.name = name;
        this.classes = classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getClasses() {
        return classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
