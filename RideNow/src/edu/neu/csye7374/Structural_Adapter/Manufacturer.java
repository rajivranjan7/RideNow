package edu.neu.csye7374.Structural_Adapter;

public class Manufacturer implements ManufacturerAPI{
    private String manufacturerName;
    private String manufacturerPhoneNum;
    private int yearEstablished;
    private Arraylist<String> vehicleProducts;

    public Manufacturer(ManufacturerBuilder builder) {
        super();
        this.manufacturerName = builder.getManufacturerName();
        this.manufacturerPhoneNum = builder.getManufacturerPhoneNum;
        this.yearEstablished = builder.getYearEstablished;
        this.vehicleProducts = builder.getVehicleProducts();
    }
    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getManufacturerPhoneNum() {
        return manufacturerPhoneNum;
    }

    public void setManufacturerPhoneNum(String manufacturerPhoneNum) {
        this.manufacturerPhoneNum = manufacturerPhoneNum;
    }

    public int getYearEstablished() {
        return yearEstablished;
    }

    public void setYearEstablished(int yearEstablished) {
        this.yearEstablished = yearEstablished;
    }

    public Arraylist<String> getVehicleProducts() {
        return vehicleProducts;
    }

    public void setVehicleProducts(Arraylist<String> vehicleProducts) {
        this.vehicleProducts = vehicleProducts;
    }

    @Override
    public String getManufacturerName() {
        // TODO Auto-generated method stub
        return "Manufacturer Name: "+ this.manufacturerName;
    }
    @Override
    public int getManufacturerAge() {
        // TODO Auto-generated method stub
        int age = 2023 - this.yearEstablished;
        return "Manufacturer Age"+ age;
    }
    @Override
    public String toString() {
        return "Manufacturer [manufacturerName=" + manufacturerName + ", manufacturerPhoneNum=" + manufacturerPhoneNum + ", yearEstablished=" + yearEstablished
                + ", vehicleProducts=" + vehicleProducts + "]";
    }

}
