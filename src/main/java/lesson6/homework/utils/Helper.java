package lesson6.homework.utils;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Helper {
    public String phoneCheckMethod(Scanner scanner) {
        System.out.println("Please enter your phone number in the format +38 0-- -------");
        String phoneNumber = scanner.nextLine();
        String regexPhoneNumber = "^[+][3][8]\\s[0]\\d{2}\\s\\d{7}$";
        Pattern pattern = Pattern.compile(regexPhoneNumber);
        Matcher matcherPhoneNumber = pattern.matcher(phoneNumber);
        if (!matcherPhoneNumber.find()) {
            System.out.println("The phone number is invalid. Please enter again in the format +38 0-- -------");
            phoneNumber = scanner.nextLine();
            matcherPhoneNumber = pattern.matcher(phoneNumber);
        }
        System.out.println(phoneNumber);
        return phoneNumber;
    }

    public String emailCheckMethod(Scanner scanner) {
        System.out.println("Please enter your email :");
        String email = scanner.nextLine();
        String regexEmail = "^+\\w\\D+[a-zA-Z]\\D+[a-zA-Z]";
        Pattern pattern = Pattern.compile(regexEmail);
        Matcher matcherEmail = pattern.matcher(email);
        if (!matcherEmail.find()) {
            System.out.println("Wrong email format. Please check and enter email again:");
            email = scanner.nextLine();
            matcherEmail = pattern.matcher(email);
        }
        System.out.println(email);
        return email;
    }

    public String dateCheckMethod(Scanner scanner) {
        System.out.println("Please enter your date of birth in the format DDMMYYYY :");
        String dateOfBirth = scanner.nextLine();
        String regexDateOfBirth = "^+[0-31]{2}[1-12]{2}[1900-2021]{4}$";
        Pattern pattern = Pattern.compile(regexDateOfBirth);
        Matcher matcherDateOfBirth = pattern.matcher(dateOfBirth);
        if (!matcherDateOfBirth.find()) {
            System.out.println("Incorrect date of birth, please check your entry and try again:");
            dateOfBirth = scanner.nextLine();
            matcherDateOfBirth = pattern.matcher(dateOfBirth);
        }
        System.out.println(dateOfBirth);
        return dateOfBirth;
    }
}
