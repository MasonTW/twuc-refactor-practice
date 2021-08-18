package com.twu.refactoring;

public class NewReleaseMovie implements Movie {
    private String title;

    public NewReleaseMovie(String title) {
        this.title = title;
    }

    @Override
    public double getAmount(double amount, int rented) {
        amount += rented * 3;
        return amount;
    }

    public String getTitle() {
        return title;
    }
}
