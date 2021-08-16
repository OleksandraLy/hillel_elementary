package lesson6_classwork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Client {
    private static final String USER_STATUS_INFO = "User with id=%d has status %s\", 1231, \"active";
    public static void main(String[] args) {
        String test = "test";
        System.out.println(test.replace("t", "m"));
       /* System.out.printf("User with id=%d has status %s", 1231, "active");
        System.out.printf(USER_STATUS_INFO, 1231, "active");*/

        Pattern pattern = Pattern.compile("\\d\\w\\d\\w");
        Matcher matcher = pattern.matcher("234w876fdfsjhkj");

        //System.out.println(matcher.matches());
        System.out.println(matcher.find());
    }
}
