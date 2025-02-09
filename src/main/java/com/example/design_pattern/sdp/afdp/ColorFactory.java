package com.example.design_pattern.sdp.afdp;

public class ColorFactory extends AbstractFactory {
    @Override
    public Vehicle getVehicle(String vehicleType) {
        return null; // Not applicable for this factory
    }

    @Override
    public Color getColor(String colorType) {
        if (colorType == null) {
            return null;
        }
        if (colorType.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (colorType.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }
}
