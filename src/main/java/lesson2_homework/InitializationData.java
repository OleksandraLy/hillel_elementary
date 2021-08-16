package lesson2_homework;

import java.util.*;

public class InitializationData {
    public static Information information = new Information();
    public static List<String> nicknames = new ArrayList<>();
    public static Set<String> mails = new HashSet<>();
    public static Map<String, String> nicknamesMails = new HashMap<>();
    public static void main(String[] args) {
        returnInformation();
        trimSize();
    }
    public static void returnInformation (){

   for (int i=1; i<30; i++) {
   nicknames.add("user" + i);
   mails.add("mail" + i + "@mail.com");
   nicknamesMails.put("mail" + i + "@mail.com", "user" + i);} ;
   for (int a=1; a<= 10; a++) {
       nicknames.add("user");
       mails.add("mail@mail.com");
       nicknamesMails.put("mail@mail.com", "user");};
    }
    private static void trimSize(){
        if (nicknames.size()!=mails.size()) {
            Set<String> temporarySet = new HashSet<>();
            temporarySet.addAll(nicknames);
            nicknames.clear();
            nicknames.addAll(temporarySet);
        };
        if (nicknamesMails.size()!= mails.size()){
            nicknamesMails.remove("mail@mail.com");
            nicknamesMails.put("mail@mail.com", "user");
        }
    }
}
