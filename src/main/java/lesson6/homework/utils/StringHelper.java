package lesson6.homework.utils;

import lesson6.homework.exceptions.StringFormatException;

public class StringHelper {
    public String helpMethod(String string, char[] array) throws StringFormatException {
        String someString = "some string";
        char[] charArray = {'Z', '2', '%', '*'};
        try {
            boolean b = charArray == null;
        } catch (NullPointerException e){
            e.printStackTrace();
        }
        String arrayString = charArray.toString();
        String arrayStringTrimmed = arrayString.trim();
        String someStringTrimmed = someString.trim();
        boolean isTheArrayStringEmpty = arrayStringTrimmed.isEmpty();
        boolean isSomeStringEmpty = someStringTrimmed.isEmpty();
        if ((isTheArrayStringEmpty && isSomeStringEmpty) == true) {
            throw new StringFormatException();
        }
        String arrayStringLower = arrayStringTrimmed.toUpperCase();
        String someStringUpper = someStringTrimmed.toLowerCase();

        String stringsConcat = arrayStringLower.concat(" " + someStringUpper);
        System.out.println(stringsConcat);

        System.out.println((stringsConcat.length()));
        String cutString = stringsConcat.substring(12, 13);
        System.out.println(cutString);
        return cutString;
    }
}
