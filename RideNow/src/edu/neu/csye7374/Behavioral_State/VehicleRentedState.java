package edu.neu.csye7374.Behavioral_State;

import edu.neu.csye7374.Vehicle;

public class VehicleRentedState implements BookingStateAPI {

    private Vehicle vehicle;

    public VehicleRentedState(Vehicle vehicle) {
        super();
        this.vehicle = vehicle;
    }

    @Override
    public void verificationState() {
        System.err.println("ERROR - Vehicle has been rented already!!");
    }

    @Override
    public void bookingConfirmedState() {
        System.err.println("ERROR - Vehicle has been rented already!!");
    }

    @Override
    public void vehicleRentedState() {
        System.err.println("ERROR - Vehicle has been rented already!!");
    }

    @Override
    public void vehicleReturnedState() {
        System.out.println("SUCCESS - Vehicle has been returned successfully!!");
    }
}
