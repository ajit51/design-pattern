package com.example.design_pattern.sdp.afdp;

public class VehicleFactory extends AbstractFactory {
    @Override
    public Vehicle getVehicle(String vehicleType) {
        if (vehicleType == null) {
            return null;
        }
        if (vehicleType.equalsIgnoreCase("CAR")) {
            return new Car();
        } else if (vehicleType.equalsIgnoreCase("BIKE")) {
            return new Bike();
        }
        return null;
    }

    @Override
    public Color getColor(String colorType) {
        return null; // Not applicable for this factory
    }
}
