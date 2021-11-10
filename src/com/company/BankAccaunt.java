package com.company;

public class BankAccaunt {
    private double amount;

    public double getAmount() {
        return amount;
    }
    public void deposit(double sum){
        amount = amount + sum;
    }
    public double withDraw(int sum) throws LimitExseption {
        if (sum > amount){
            throw new LimitExseption("снимаем обший счет",getAmount());
        }
        amount -= sum;
        System.out.println("счет снятия " + sum);
        return amount;
    }

}


