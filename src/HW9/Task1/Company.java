package HW9.Task1;
/*
1. Employee Management System – Inheritance
A company has different types of employees: full-time and part-time employees.
All employees have:
•	a name,
•	a base salary,
•	and a method to display employee information.
However, each employee type has specific behavior.
Full-Time Employees:
•	receive an annual bonus calculated as a percentage of their salary,
•	have paid vacation days.
Part-Time Employees:
•	are paid per hour,
•	must store the number of worked hours,
•	can work in multiple departments.
Requirements:
1.	Create a base class called Employee containing common data and methods.
2.	Create two classes:
o	FullTimeEmployee
o	PartTimeEmployee
Both classes must inherit from Employee.
3.	Add specific fields and methods for each employee type.
4.	Create multiple employees and display their information.

 */
public class Company {
    public static void main(String[] args) {
     Employee cleaner = new Employee("liusea",1000,"Cleaner");
     cleaner.displayStatus();

     FullTimeEmployee engineer = new FullTimeEmployee("Vasea",3000,"Engineer");
     engineer.displayStatus();
     engineer.usePayedVacationDays(20);
     engineer.displayStatus();
     engineer.setBonusCoefficient(1.5/12.0);
     engineer.displayStatus();

     PartTimeEmployee designer = new PartTimeEmployee("Afanasiy","Designer",10.5);
     designer.logHoursWorked(15);
     designer.displayStatus();
    }
}
