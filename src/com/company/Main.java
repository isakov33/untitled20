package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BankAccaunt bankAccount = new BankAccaunt();
        Scanner scanner = new Scanner(System.in);
        System.out.println("какую сумму вы хотите вывести?");
        bankAccount.deposit(scanner.nextDouble());

        while (true) {

            try {
                System.out.println("у вас на счете " + bankAccount.getAmount());
                bankAccount.withDraw(6000);

                System.out.println("-----------------");

            } catch (LimitExseption e) {
                System.out.println(e.getMessage());

                try {
                    bankAccount.withDraw((int) bankAccount.getAmount());

                    System.out.println("-----------------");
                    System.out.println("общий счет " + bankAccount.getAmount());



                } catch (LimitExseption limitException) {
                    limitException.printStackTrace();
                }
                break;
            }
        }
    }

}

