package lesson5_classwork;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("name1", "surname1");
        Client client1 = new Client("name1", "surname1");
        Class<?> classClient = client.getClass();
        System.out.println(client.getClass());
        System.out.println(client.hashCode());
        System.out.println(client.hashCode());

    }
}
