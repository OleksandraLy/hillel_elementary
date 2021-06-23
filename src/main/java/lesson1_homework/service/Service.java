package lesson1_homework.service;

import lesson1_homework.human.Human;

import java.io.IOException;

public interface Service {


    boolean checkUser(Human human) throws IOException;

    void writeToFile(Human human) throws IOException;
        /*FileWriter dataWriter = new FileWriter(path2);
        dataWriter.write("Lina\n Ghostly\n 49 \n greenl@mail.com\n Qwerty \n ADMIN");
        dataWriter.close();*/
}
