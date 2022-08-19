package day13;

import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        Date date = new Date(1212121212121L);
        System.out.println(date);

        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");

        user1.sendMessage(user2, "Hello");
        user1.sendMessage(user2, "How are you?");

        user2.sendMessage(user1, "Hello");
        user2.sendMessage(user1, "Im fine thanks and you?");
        MessageDatabase.showDialog(user1, user2);
    }
}
