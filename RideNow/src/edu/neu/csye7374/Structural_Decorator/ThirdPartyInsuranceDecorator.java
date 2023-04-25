package edu.neu.csye7374.Structural_Decorator;

import edu.neu.csye7374.VehicleAPI;

public class ThirdPartyInsuranceDecorator extends DecoratorAPI{
    public ThirdPartyInsuranceDecorator(VehicleAPI obj) {
        super(obj);
    }

    @Override
    public double getVehiclePrice(){
        return super.getVehiclePrice() + 350.00;
    }

    @Override
    public String vehicleDescription(){
        return super.vehicleDescription() + " -> Added Third Party Insurance \n";
    }
}
