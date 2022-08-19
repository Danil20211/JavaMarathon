package day334;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Test7 {
    public static void main(String[] args) {
        Person person1 = new Person(1);
        Person person2 = new Person(2);
        Person person3 = new Person(3);

        Queue<Person> people = new ArrayBlockingQueue<>(10);
        people.add(person2);
        people.add(person3);
        people.add(person1);

        System.out.println(people.remove());
        System.out.println(people.peek()); // не удаляя просто посмотреть первого в очереди
        System.out.println(people);
    }
}

class Person {
    private int id;

    public Person(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}

