package edu.neu.csye7374.Behavioral_Observer;

public class PriceObserver implements BookingObserver {

    @Override
    public void updated(Booking booking) {
        double total = booking.getBookingCost();
        if(total>=500) {
            booking.setDiscount(20);
        }else if(total>=200) {
            booking.setDiscount(10);
        }

    }
}
