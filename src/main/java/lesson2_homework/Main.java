package lesson2_homework;

import com.sun.deploy.net.MessageHeader;

import java.util.ArrayList;
import java.util.List;

import static lesson2_homework.InitializationData.*;

public class Main {
    static InitializationData initializationData = new InitializationData();
    static Information information = new Information();

    public static void main(String[] args) {
        List<Byte> someList = new ArrayList<>();
        for (byte c=1; c<5; c++){
            someList.add(c);
        }
        innerMethod(someList, information);
        System.out.println(someList.size());
        System.out.println(nicknames.toString());
        System.out.println(mails.toString());
        System.out.println(nicknamesMails.toString());
    }

    public static void innerMethod(List<? extends Number> list, Information information){
        List<Byte> byteList = new ArrayList<>();
        for (byte i=10; i<20; i++){
        byteList.add(i);}
        for (byte b=1; b<byteList.size(); b++){
        String element = String.valueOf(byteList.get(b));
        if (!nicknames.contains(element))
        nicknames.add(element);
        if (!mails.contains(element+"@mail.com"))
        mails.add(element+"@mail.com");
        if (!nicknamesMails.containsKey(element+"@mail.com"))
        nicknamesMails.put(element+"@mail.com", element);}
    }
}
