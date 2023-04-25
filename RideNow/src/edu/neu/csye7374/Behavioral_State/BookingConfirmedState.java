package edu.neu.csye7374.Behavioral_State;

import edu.neu.csye7374.Vehicle;

public class BookingConfirmedState implements BookingStateAPI {

    private Vehicle vehicle;

    public BookingConfirmedState(Vehicle vehicle) {
        super();
        this.vehicle = vehicle;
    }

    @Override
    public void verificationState() {
        System.err.println("ERROR - Booking is already confirmed!!");
    }

    @Override
    public void bookingConfirmedState() {
        System.err.println("ERROR - Booking is already confirmed!!");
    }

    @Override
    public void vehicleRentedState() {
        System.out.println("SUCCESS - Vehicle is successfully rented!!");
    }

    @Override
    public void vehicleReturnedState() {
        System.err.println("ERROR - Vehicle hasn't been rented yet!!");
    }
}
