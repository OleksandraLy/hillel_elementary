package lesson1_homework.service;

import lesson1_homework.human.Human;
import lesson1_homework.service.AbstractService;
import lesson1_homework.service.Service;

import java.io.IOException;

public class UserService extends AbstractService implements Service {

    @Override
    public void writeToFile(Human human) throws IOException {
        System.out.println("The method is unavailable");
    }
}
