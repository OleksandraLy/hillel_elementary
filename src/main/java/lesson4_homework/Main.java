package lesson4_homework;

import lesson4_homework.entities.Client;
import lesson4_homework.exceptions.WrongFieldException;
import lesson4_homework.exceptions.WrongSumException;
import lesson4_homework.services.TransactionService;
import lesson4_homework.utils.Helper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws WrongFieldException, WrongSumException {
        Helper helper = new Helper();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the sender account ID");
        String userAccountID = scanner.nextLine();
        userIDLength(userAccountID, helper, scanner);
        System.out.println("Please enter the recipient account ID");
        String recipientAccountId = scanner.nextLine();
        userIDLength(recipientAccountId, helper, scanner);
        System.out.println("Please enter the sum of transaction");
        float sumOfTransaction = scanner.nextFloat();

        Client client = new Client();
        client.setAccountId(userAccountID);
        client.setSum(sumOfTransaction);

        sumOfTransaction(sumOfTransaction, helper, scanner, client);

        TransactionService transactionService = new TransactionService();
        transactionService.moneyTransition(client, recipientAccountId);
        System.out.println("Operation is finished. Money transaction is successful");
        scanner.close();
    }

    public static void userIDLength(String userAccountID, Helper helper, Scanner scanner) throws WrongFieldException {
        while (userAccountID.length() != 10) {
            try {
                helper.accountIdCheckMethod(scanner.nextLine());
            } catch (WrongFieldException e) {
                e.printStackTrace();
            }
            System.out.println("This field should have 10 symbols. Please enter user account ID again");
            userAccountID = scanner.nextLine();
        }
    }

    public static void sumOfTransaction(float sumOfTransaction, Helper helper, Scanner scanner, Client client) throws WrongSumException {
        while (sumOfTransaction > 1000) {
            try {
                helper.sumCheckMethod(client.getSum());
            } catch (WrongSumException e) {
                e.printStackTrace();
            }
            System.out.println("The sum has to be below 1000 hrn. Please enter another sum");
            sumOfTransaction = scanner.nextFloat();
        }
    }
}
