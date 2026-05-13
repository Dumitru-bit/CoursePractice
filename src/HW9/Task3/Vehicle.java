package HW9.Task3;

public class Vehicle {
    private final String registrationNumber;
    private double initialAverageFuelConsumption;
    private int initialOdometerValue;

    protected int currentOdometerValue;
    protected double currentAverageFuelConsumption;

    // fuel Consumption Coefficient will change the average fuel consumption based on the delta between the initial odometer and current
    private final double fuelConsumptionCoefficient;

    Vehicle (String registrationNumber, double averageFuelConsumption, int initialOdometerValue, int currentOdometerValue, double fuelConsumptionCoefficient){
        this.registrationNumber = registrationNumber;
        this.initialAverageFuelConsumption = averageFuelConsumption;
        this.initialOdometerValue = initialOdometerValue;
        this.currentOdometerValue = currentOdometerValue;
        this.fuelConsumptionCoefficient = fuelConsumptionCoefficient;
    }


    public double getInitialAverageFuelConsumption() {
        return initialAverageFuelConsumption;
    }

    public int getInitialOdometerValue() {
        return initialOdometerValue;
    }

    public int getCurrentOdometerValue() {
        return currentOdometerValue;
    }
    public void setCurrentOdometerValue(int currentOdometerValue) {this.currentOdometerValue=currentOdometerValue;}

    public double getCurrentAverageFuelConsumption() {
        return currentAverageFuelConsumption;
    }

    public double getFuelConsumptionCoefficient() {
        return fuelConsumptionCoefficient;
    }
    public String getRegistrationNumber(){
        return registrationNumber;
    }
}

