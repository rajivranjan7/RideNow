package edu.neu.csye7374.Behavioral_State;

public interface BookingStateAPI {
    void verificationState();
    void bookingConfirmedState();
    void vehicleRentedState();
    void vehicleReturnedState();
}
