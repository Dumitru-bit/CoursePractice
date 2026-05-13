package HW9.Task3;

public class Truck extends Vehicle{

    private final double nominalCargoWeight;
    private double cargoWeight;

    Truck(String registrationNumber, double averageFuelConsumption, int initialOdometerValue, int currentOdometerValue, double fuelConsumptionCoefficient,double nominalCargoWeight){
        super(registrationNumber, averageFuelConsumption,initialOdometerValue,currentOdometerValue,fuelConsumptionCoefficient);
        this.nominalCargoWeight = nominalCargoWeight;
    }
    public void setCargoWeight (double cargoWeight){this.cargoWeight = cargoWeight;}

    public double calculateCurrentAverageFuelConsumption (){

        if (cargoWeight <= nominalCargoWeight)
        currentAverageFuelConsumption =
                getInitialAverageFuelConsumption() * getFuelConsumptionCoefficient() * (currentOdometerValue - getInitialOdometerValue())/getInitialOdometerValue();
        else currentAverageFuelConsumption = getInitialAverageFuelConsumption() * getFuelConsumptionCoefficient()
                * (currentOdometerValue - getInitialOdometerValue()) / getInitialOdometerValue()
                * (cargoWeight-nominalCargoWeight)/nominalCargoWeight;

        return currentAverageFuelConsumption;
    }

    public double getNominalCargoWeight() {
        return nominalCargoWeight;
    }
    public void display() {
        System.out.println("Truck " +  getRegistrationNumber() +
                "\n Initially: " +
                "\n At odometer value: " + getInitialOdometerValue() + " Fuel consumption was: " + getInitialAverageFuelConsumption() +
                        "\n Currently: " +
                        "\n At odometer value: " + currentOdometerValue + " Fuel consumption is: " + calculateCurrentAverageFuelConsumption() + " for Cargo weight of: " + cargoWeight);
    }
}
