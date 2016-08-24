package com.example.OriginCode;

/**
 * Created by Administrator on 2016/8/24.
 */
public class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(int daysRented, Movie movie) {
        this.daysRented = daysRented;
        this.movie = movie;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }
}
