package edu.neu.csye7374.Behavioral_State;

import edu.neu.csye7374.Vehicle;

public class VehicleReturnedState implements BookingStateAPI {

    private Vehicle vehicle;

    public VehicleReturnedState(Vehicle vehicle) {
        super();
        this.vehicle = vehicle;
    }

    @Override
    public void verificationState() {
        System.out.println("SUCCESS - Verification has been initiated!!");
    }

    @Override
    public void bookingConfirmedState() {
        System.err.println("ERROR - Vehicle has been returned already!!");
    }

    @Override
    public void vehicleRentedState() {
        System.err.println("ERROR - Vehicle has been returned already!!");
    }

    @Override
    public void vehicleReturnedState() {
        System.err.println("ERROR - Vehicle has been returned already!!");
    }
}
