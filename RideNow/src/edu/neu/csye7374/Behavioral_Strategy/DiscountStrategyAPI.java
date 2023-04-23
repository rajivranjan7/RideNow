package edu.neu.csye7374.Behavioral_Strategy;

import edu.neu.csye7374.Vehicle;

public interface DiscountStrategyAPI {
    double discountPrice(Book book);
    String discountDescription(Book book);
}