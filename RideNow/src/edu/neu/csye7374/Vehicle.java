package edu.neu.csye7374;

import edu.neu.csye7374.Creational_Builder.VehicleBuilder;

public class Vehicle implements VehicleAPI {

	public int vehicleId;
	public String vehicleName;
	public double vehiclePrice;
	public VehicleType vehicleType;
	public Object vehicleManufacturer;
	
	
	
	
	public Vehicle(VehicleBuilder builder) {
		super();
		this.vehicleId = builder.getVehicleId();
		this.vehicleName = builder.getVehicleName();
		this.vehiclePrice = builder.getVehiclePrice();
		this.vehicleType = builder.getVehicleType();
		this.vehicleManufacturer = builder.getVehicleManufacturer();
	}

	
	public int getVehicleId() {
		return vehicleId;
	}


	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}


	public String getVehicleName() {
		return vehicleName;
	}


	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}


	public VehicleType getVehicleType() {
		return vehicleType;
	}


	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}


	public void setVehicleManufacturer(Object vehicleManufacturer) {
		this.vehicleManufacturer = vehicleManufacturer;
	}


	public void setVehiclePrice(double vehiclePrice) {
		this.vehiclePrice = vehiclePrice;
	}


	@Override
	public String vehicleDescription() {
		// TODO Auto-generated method stub
		return "Vehicle Name: "+ this.vehicleName + "<==> Type: "+this.vehicleType;
	}

	
	public Object getVehicleManufacturer() {
		// TODO Auto-generated method stub
		return String.class.cast(vehicleManufacturer);
	}
	
	@Override
	public int totalNoOfVehicles() {
		// TODO Auto-generated method stub
		return (int) Math.random() * 10;
	}

	
	public double getVehiclePrice() {
		// TODO Auto-generated method stub
		return vehiclePrice;
	}
	
	public String rentVehicle() {
		return this.vehicleName + " has been rented!!";
	}

	public double runStrategy() {
		return 0;
	}


	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", vehicleName=" + vehicleName + ", vehiclePrice=" + vehiclePrice
				+ ", vehicleType=" + vehicleType + ", vehicleManufacturer=" + (String)vehicleManufacturer + "]";
	}
	
	
	
}
