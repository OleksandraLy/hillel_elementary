package lesson1_homework.human;


public class Admin extends Human {
    private static final String ROLE = "ADMIN";
    public Admin(String name, String surname, int age, String mail, String password) {
        super(name, surname, age, mail, password, "ADMIN");
    }
}
