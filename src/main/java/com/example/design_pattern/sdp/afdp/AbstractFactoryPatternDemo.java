package com.example.design_pattern.sdp.afdp;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        // Get the Vehicle Factory
        AbstractFactory vehicleFactory = FactoryProducer.getFactory("VEHICLE");

        // Create a Car
        Vehicle car = vehicleFactory.getVehicle("CAR");
        car.drive(); // Output: Driving a car...

        // Create a Bike
        Vehicle bike = vehicleFactory.getVehicle("BIKE");
        bike.drive(); // Output: Riding a bike...

        // Get the Color Factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        // Create Red Color
        Color red = colorFactory.getColor("RED");
        red.paint(); // Output: Painting red...

        // Create Blue Color
        Color blue = colorFactory.getColor("BLUE");
        blue.paint(); // Output: Painting blue...
    }
}
