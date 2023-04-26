package edu.neu.csye7374.Structural_Adapter;

import edu.neu.csye7374.VehicleAPI;

public class ManufacturerObjectAdapter implements ManufacturerAPI{
    private VehicleAPI vehicleAPI;

    public ManufacturerObjectAdapter(VehicleAPI vehicleAPI) {
        this.vehicleAPI = vehicleAPI;
    }

    @Override
    public String getManufacturerName() {
        // TODO Auto-generated method stub
        return "Manufacturer Name: "+ vehicleAPI.getManufacturerName();
    }
    @Override
    public int getManufacturerAge() {
        // TODO Auto-generated method stub
        return "Manufacturer Age"+ vehicleAPI.getManufacturerAge();
    }
}
