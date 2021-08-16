package lesson6.homework;

import lesson6.homework.exceptions.StringFormatException;
import lesson6.homework.utils.Helper;
import lesson6.homework.utils.StringHelper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws StringFormatException {
        StringHelper stringHelper = new StringHelper();
        stringHelper.helpMethod("some string", new char[]{'Z', '$', '%', '6'});
        Scanner scanner = new Scanner(System.in);
        Helper helper = new Helper();
        helper.phoneCheckMethod(scanner);
        helper.emailCheckMethod(scanner);
        helper.dateCheckMethod(scanner);
        scanner.close();
    }
}
