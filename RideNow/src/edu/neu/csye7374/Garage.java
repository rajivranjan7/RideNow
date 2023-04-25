package edu.neu.csye7374;

import edu.neu.csye7374.Behavioral_Command.*;
import edu.neu.csye7374.Behavioral_State.ClosedState;
import edu.neu.csye7374.Behavioral_State.GarageStateAPI;
import edu.neu.csye7374.Behavioral_State.OpenState;
import edu.neu.csye7374.Behavioral_State.StockState;
import edu.neu.csye7374.Behavioral_Strategy.*;
import edu.neu.csye7374.Creational_Builder.VehicleBuilder;
import edu.neu.csye7374.Creational_Factory.VehicleFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Garage implements GarageStateAPI {

    private String name;
    private List<Vehicle> vehicleList = new ArrayList<>();
    private List<Person> listOfPerson = new ArrayList<>();
    public static DiscountStrategy strategy = DiscountStrategy.NONE;
    private GarageStateAPI openState = new OpenState(this);
    private GarageStateAPI stockState = new StockState(this);
    private GarageStateAPI closeState = new ClosedState(this);
    private GarageStateAPI state;


    private static Map<DiscountStrategy, DiscountStrategyAPI> strategyMap = new HashMap<>();
    {
//    	strategyMap.put(DiscountStrategy.NONE, null);
        strategyMap.put(DiscountStrategy.StudentDiscount, new StudentDiscount());
        strategyMap.put(DiscountStrategy.EmployeeDiscount, new EmployeeDiscount());
        strategyMap.put(DiscountStrategy.MemberDiscount, new MemberDiscount());
    }

    public Garage(String name) {
        super();
        this.name = name;
        this.state = getOpenState();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setItemList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public List<Person> getListOfPerson() {
        return listOfPerson;
    }

    public void setListOfPerson(List<Person> listOfPerson) {
        this.listOfPerson = listOfPerson;
    }

    public static DiscountStrategy getStrategy() {
        return strategy;
    }

    public static void setStrategy(DiscountStrategy strategy) {
        Garage.strategy = strategy;
    }

    public static Map<DiscountStrategy, DiscountStrategyAPI> getstrategyMap() {
        return strategyMap;
    }

    public static void setStrategyMap(Map<DiscountStrategy, DiscountStrategyAPI> strategyMap) {
        Garage.strategyMap = strategyMap;
    }

    public GarageStateAPI getState() {
        return state;
    }

    public void setState(GarageStateAPI state) {
        this.state = state;
    }

    public GarageStateAPI getOpenState() {
        return openState;
    }

    public void setOpenState(GarageStateAPI openState) {
        this.openState = openState;
    }

    public GarageStateAPI getStockState() {
        return stockState;
    }

    public void setStockState(GarageStateAPI stockState) {
        this.stockState = stockState;
    }

    public GarageStateAPI getCloseState() {
        return closeState;
    }

    public void setCloseState(GarageStateAPI closeState) {
        this.closeState = closeState;
    }

    @Override
    public void stateOpen() {
        this.state.stateOpen();

    }

    @Override
    public void stateClose() {
        this.state.stateClose();
    }

    @Override
    public void stateStock() {
        this.state.stateStock();
    }

    public static void demo() {

        List<Vehicle> vehicleList = new ArrayList<>();

        //Builder Pattern and getting object of Builder using Factory and Singleton Pattern
        System.out.println("***************************************************************************************");
        System.out.println("Demonstrating of Builder pattern. Delegating the responsibilty of creating Books objects to Book Builder which implements build method and builds book object for us");
        System.out.println("Using Factory and singleton pattern to get only single instance of Book Builder object");
        VehicleBuilder vehicleBuilder = new VehicleBuilder(1, "RAV4", 26150, VehicleType.SUV, "Toyota");
        VehicleAPI vehicle = VehicleFactory.getInstance().getObject(vehicleBuilder);
        vehicleList.add((Vehicle) vehicle);
        System.out.println(vehicle);

        vehicleBuilder = new VehicleBuilder(2, "K5", 2468, VehicleType.Sedan, "Kia");
        vehicle = VehicleFactory.getInstance().getObject(vehicleBuilder);
        vehicleList.add((Vehicle)vehicle);

        vehicleBuilder = new VehicleBuilder(3, "Mustang", 3305, VehicleType.Convertible, "Ford");
        vehicle = VehicleFactory.getInstance().getObject(vehicleBuilder);
        vehicleList.add((Vehicle)vehicle);


        vehicleBuilder = new VehicleBuilder(4, "Veloster", 1990, VehicleType.Hatchback, "Hyundai");
        vehicle = VehicleFactory.getInstance().getObject(vehicleBuilder);
        vehicleList.add((Vehicle)vehicle);


        vehicleBuilder = new VehicleBuilder(5, "Silverado 1500", 2930, VehicleType.PickupTruck, "Chevrolet");
        vehicle = VehicleFactory.getInstance().getObject(vehicleBuilder);
        vehicleList.add((Vehicle)vehicle);


        vehicleBuilder = new VehicleBuilder(6, "Accord", 2550, VehicleType.Sedan, "Honda");
        vehicle = VehicleFactory.getInstance().getObject(vehicleBuilder);
        vehicleList.add((Vehicle)vehicle);
        System.out.println("***************************************************************************************");

        //Command Pattern
        System.out.println("Demonstration of Command pattern to send the request for all books orders and print them");
        CommandInvoker invoker = CommandInvoker.getInstance();
        invoker.setCommand(new RentByDayCommand((Vehicle) vehicle));
        System.out.println(invoker.invoke());
        invoker.setCommand(new RentByHourCommand((Vehicle) vehicle));
        System.out.println(invoker.invoke());
        invoker.setCommand(new RentAsGuestCommand((Vehicle) vehicle));
        System.out.println(invoker.invoke());
        invoker.setCommand(new MembershipCommand((Vehicle) vehicle));
        System.out.println(invoker.invoke());

    }
}

