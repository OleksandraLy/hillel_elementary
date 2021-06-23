package lesson1_homework.service;

import lesson1_homework.human.Human;

import java.io.FileWriter;
import java.io.IOException;

public class AdminService extends AbstractService implements Service {
    private String path = "C:\\Users\\Олександра\\IdeaProjects\\hillel_elementary\\src\\main\\resources\\file";

    @Override
    public void writeToFile(Human human) throws IOException {
            FileWriter dataWriter = new FileWriter(path);
            dataWriter.write(human.getName());
            dataWriter.write(human.getSurname());
            dataWriter.write(human.getAge());
            dataWriter.write(human.getMail());
            dataWriter.write(human.getPassword());
            dataWriter.write(human.getRole());
            dataWriter.close();
    }
}
