package com.twu.refactoring;

public class ChildMovie implements Movie {

    private String title;
    public ChildMovie(String title) {
        this.title = title;
    }



    @Override
    public double getAmount(double amount,int rented) {
        amount += 1.5;
        if (rented > 3)
            amount += (rented - 3) * 1.5;
        return amount;
    }

    public String getTitle() {
        return title;
    }
}
