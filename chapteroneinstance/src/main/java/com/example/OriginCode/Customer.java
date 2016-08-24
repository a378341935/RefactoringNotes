package com.example.OriginCode;

import java.util.ListIterator;
import java.util.Vector;

/**
 * Created by Fangxing Liu on 2016/8/24.
 */
public class Customer {
    private String name;
    private Vector<Rental> rentals = new Vector<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental newRental){
        rentals.add(newRental);
    }

    public String getName(){
        return name;
    }

    public String statement(){
        StringBuffer result = new StringBuffer("Rental Record For "+name+"\n");
        double totalPrice = 0;
        int frequentRenterPoints = 0;
        ListIterator<Rental> rentalIterator = rentals.listIterator();

        while (rentalIterator.hasNext()) {
            Rental aRental = rentalIterator.next();
            double thisPrice = 0;
            //价格处理
            switch (aRental.getMovie().getPriceCode()){
                case Movie.REGULAR:
                    thisPrice = 2;
                    if (aRental.getDaysRented() > 2){
                        thisPrice = (aRental.getDaysRented() - 2) * 1.5d;
                    }
                    break;
                case Movie.NEW_RELEASE:
                    thisPrice = aRental.getDaysRented() * 3;
                    break;
                case Movie.CHILDRENS:
                    thisPrice = 1.5;
                    if (aRental.getDaysRented() > 3){
                        thisPrice = (aRental.getDaysRented() - 3) * 1.5d;
                    }
                    break;
            }

            //积分处理
            frequentRenterPoints++;
            if (aRental.getMovie().getPriceCode() == Movie.NEW_RELEASE && aRental.getDaysRented() > 1){
                frequentRenterPoints++;
            }

            result.append("\t"+aRental.getMovie().getTitle()+"\t"+thisPrice+"\n");
            totalPrice+=thisPrice;
        }
        result.append("Price owed is "+totalPrice+"\n");
        result.append("You earned " + frequentRenterPoints +" frequent renter point");
        return result.toString();
    }
}
