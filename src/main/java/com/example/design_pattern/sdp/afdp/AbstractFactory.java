package com.example.design_pattern.sdp.afdp;

public abstract class AbstractFactory {
    abstract Vehicle getVehicle(String vehicleType);
    abstract Color getColor(String colorType);
}
