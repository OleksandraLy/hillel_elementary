package lesson1_homework;

import lesson1_homework.human.Admin;
import lesson1_homework.human.User;
import lesson1_homework.service.AdminService;
import lesson1_homework.service.UserService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Олександра\\IdeaProjects\\hillel_elementary\\src\\main\\resources\\file";
        User user = new User("Lotta", "Green", 23,"greenl@mail.com", "Qwerty1");
        Admin admin = new Admin("Lesley", "Green", 52, "greenl@mail.com", "cher8pa5y");
        UserService userService = new UserService();
        AdminService adminService = new AdminService();
        userService.writeToFile(user);
        adminService.writeToFile(admin);
        adminService.writeToFile(user);
        System.out.println(userService.checkUser(admin));
        System.out.println(adminService.checkUser(user));
    }
}
