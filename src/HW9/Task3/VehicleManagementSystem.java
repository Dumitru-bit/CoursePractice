package HW9.Task3;

public class VehicleManagementSystem {
    public static void main(String[] args) {

        Car car1 = new Car("abc-001",8.5,150000,160000,0.00001);
        car1.display();
        car1.setCurrentOdometerValue(170000);
        car1.display();

        Truck truck1 = new Truck("def-002",35, 2500000,
                2505000,0.001,50);
        truck1.setCargoWeight(50);
        truck1.display();
        truck1.setCargoWeight(70);
        truck1.display();
    }
}
