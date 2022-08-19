package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Vasilii", "A1");
        System.out.println("group " + student.getGroupName());
        student.printInfo();
        Teacher teacher =new Teacher("Misha", "matematica");
        System.out.println("subject " + teacher.getSubject());
        teacher.printInfo();
    }
}
