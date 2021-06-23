package lesson1_homework.human;

import lesson1_homework.human.Human;

public class User extends Human {
    public User(String name, String surname, int age, String mail, String password) {
        super(name, surname, age, mail, password, "USER");
    }
}
