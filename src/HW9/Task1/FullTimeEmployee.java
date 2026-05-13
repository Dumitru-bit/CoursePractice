package HW9.Task1;

public class FullTimeEmployee extends Employee{
   private double bonusCoefficient;
   private int payedVacationDays;

    FullTimeEmployee(String name, int baseSalary,String role) {
        super(name, baseSalary,role);
        this.bonusCoefficient = 1.0/12.0;
        this.payedVacationDays = 28;
    }
    public void setBonusCoefficient(double bonusCoefficient){
        this.bonusCoefficient = bonusCoefficient;
    }
    public double calculateBonus(){
        return bonusCoefficient * getBaseSalary() * 12;
    }
    public void usePayedVacationDays(int intendentVacationDays){
        if (intendentVacationDays <= payedVacationDays)
            payedVacationDays -= intendentVacationDays;
        else System.out.println("intended vacation is longer than available vacation days - consult HR");
    }
    @Override
    void displayStatus(){
        System.out.println("Full time Employee: " + getName() + " is enrolled as: " + getRole() +  " and has the base salary of: " + getBaseSalary() +
                " with " + calculateBonus() + " yearly bonus" + " and " + payedVacationDays + " payed vacation days");
    }
}


