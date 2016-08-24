package com.example.OriginCode;

/**
 * Created by Fangxing Liu on 2016/8/24.
 */
public class Test {
    public static void main(String args[]){
        System.out.print(getStatementTest());
    }

    public static String getStatementTest() {
        Customer me = new Customer("Leo");
        me.addRental(new Rental(3,new Movie("FightClub",Movie.REGULAR)));
        me.addRental(new Rental(2,new Movie("Startrek2016",Movie.NEW_RELEASE)));
        me.addRental(new Rental(4,new Movie("Tom&Jerry",Movie.CHILDRENS)));
        return me.statement();
    }
}
