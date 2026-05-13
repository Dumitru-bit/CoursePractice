package HW9.Task3;

public class Car extends Vehicle{
    Car(String registrationNumber, double averageFuelConsumption, int initialOdometerValue, int currentOdometerValue, double fuelConsumptionCoefficient){
        super(registrationNumber, averageFuelConsumption,initialOdometerValue,currentOdometerValue,fuelConsumptionCoefficient);

    }

    public void display() {
        System.out.println("Car " +  getRegistrationNumber() + " currentOdometerValue=" + currentOdometerValue +
                ", currentAverageFuelConsumption=" + calculateCurrentAverageFuelConsumption());
    }

    public double calculateCurrentAverageFuelConsumption (){
        currentAverageFuelConsumption = getInitialAverageFuelConsumption() * getFuelConsumptionCoefficient() * (currentOdometerValue - getInitialOdometerValue()/100);
        return currentAverageFuelConsumption;
    }

}
