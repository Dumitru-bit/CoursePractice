package HW9.Task1;

public class PartTimeEmployee extends Employee{
    private double hoursWorked;
    private double pricePerHour;

    PartTimeEmployee(String name,String role, double pricePerHour){
        super(name,role);
        this.pricePerHour = pricePerHour;
    }
    public void logHoursWorked (double hours){
        if (hours > 0) hoursWorked += hours;
        else System.out.println("Wrong input");
    }
    public double calculateSalary(){
        return hoursWorked * pricePerHour;
    }
    public double getHoursWorked(){
        return hoursWorked;
    }
    @Override
    void displayStatus (){
        System.out.println("Part time Employee: " + getName() + " is enrolled as: " + getRole() + " and has the salary of: " + calculateSalary() +
                " for  " + getHoursWorked() + " hours worked");
    }
}

