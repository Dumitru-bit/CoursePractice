package HW9.Task1;

public class Employee {
    private String name;
    private int baseSalary;
    private String role;

    Employee(String name, int baseSalary, String role){
        this.name = name;
        this.baseSalary = baseSalary;
        this.role = role;
    }
    Employee(String name, String role){
        this.name = name;
        this.role = role;
    }
    public String getName(){
        return name;
    }
    public int getBaseSalary(){
        return baseSalary;
    }
    public String getRole(){
        return role;
    }

    void displayStatus(){
        System.out.println("Employee: " + name + " is enrolled as: " + role +  " and has the base salary of: " + baseSalary);
    }


}
