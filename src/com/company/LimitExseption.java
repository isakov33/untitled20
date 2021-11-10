package com.company;

public class LimitExseption extends Throwable {
    public LimitExseption(String message, double remainingAmount) {
        super(message);
    }

    public static double getRemainingAmount() {
        return 0;
    }
}

