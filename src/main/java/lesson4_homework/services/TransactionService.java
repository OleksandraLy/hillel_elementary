package lesson4_homework.services;

import lesson4_homework.entities.Client;
import lesson4_homework.utils.Helper;

public class TransactionService {
    public static void moneyTransition(Client client, String accountId) {
        Helper helper = new Helper();
        helper.userCheckMethod(client.getAccountId(), accountId);
    }
}
