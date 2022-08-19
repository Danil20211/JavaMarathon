package day6;
// Создать класс Teacher (Преподаватель), имеющий поля “Имя”, “Предмет”. Создать
//класс Student (Студент) с полем “Имя”.
//Каждый класс имеет конструктор (с параметрами), set и get методы по
//необходимости, а также у преподавателя есть метод evaluate (оценить студента),
//принимающий в качестве аргумента студента, и работающий следующим образом:
//внутри метода случайным образом генерируется число от 2 до 5, выводится строка:
//"Преподаватель ИМЯПРЕПОДАВАТЕЛЯ оценил студента с именем ИМЯСТУДЕНТА
//по предмету ИМЯПРЕДМЕТА на оценку ОЦЕНКА."
//Все слова, написанные большими буквами, должны быть заменены
//соответствующими значениями. ОЦЕНКА должна принимать значения "отлично”,
//"хорошо”, "удовлетворительно" или "неудовлетворительно", в зависимости от
//значения случайного числа.
//Создайте по 1 экземпляру каждого класса, у преподавателя вызовите метод оценки
//студента, передав студента в качестве аргумента метода.

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
Teacher teacher = new Teacher("Ivanov", "phisica");
Student student = new Student("misha");
teacher.evaluate(student);
    }
}
class Teacher {
    private String fio;
    private String subject;

    public Teacher(String fio, String subject) {
        this.fio = fio;
        this.subject = subject;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    void evaluate(Student student) {
        Random random = new Random();
        int randomValue = random.nextInt(4) + 2;
        String evaluation = "";
        switch (randomValue) {
            case 2:
                evaluation = "неудовлетворительно";
                break;
            case 3:
                evaluation = "удовлетворительно";
                break;
            case 4:
                evaluation = "хорошо";
                break;
            case 5:
                evaluation = "отлично";
                break;
        }

        System.out.println("Преподаватель " + this.fio + " оценил студента с именем " + student.getFio() +
                " по предмету " + this.subject + " на оценку " + evaluation);
    }
}
class Student {
    private String fio;

    public Student(String fio) {
        this.fio = fio;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }
}

