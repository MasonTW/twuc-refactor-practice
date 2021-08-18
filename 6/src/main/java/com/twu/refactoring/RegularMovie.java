package com.twu.refactoring;

public class RegularMovie implements Movie {

    private String title;

    public RegularMovie(String title) {
        this.title = title;
    }

    @Override
    public double getAmount(double amount, int rented) {
        amount += 2;
        if (rented > 2)
            amount += (rented - 2) * 1.5;
        return amount;
    }

    public String getTitle() {
        return title;
    }
}
