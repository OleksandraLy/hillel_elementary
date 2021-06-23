package lesson1_homework.service;

import lesson1_homework.human.Human;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public abstract class AbstractService {
    private String path = "C:\\Users\\Олександра\\IdeaProjects\\hillel_elementary\\src\\main\\resources\\file";

    public boolean checkUser(Human human) throws IOException {
        System.out.println("Start reading from file:");
        FileReader dataReader = new FileReader(path);
        Scanner scanner = new Scanner(dataReader);
        String file = scanner.nextLine();
        return (file.contains(human.getMail()));
    }
}
