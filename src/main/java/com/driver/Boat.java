package com.driver;

public class Boat implements WaterVehicle {

    private String type;
    private int capacity;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String getVehicleName() {
        return this.type;
    }

    @Override
    public int getVehicleCapacity() {
        return this.capacity;
    }
}
