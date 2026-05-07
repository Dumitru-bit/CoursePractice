package HW7;

public class SavingsAccount {
    static double annualInterestRate = 0.0;
    private double savingsBalance = 0;

    SavingsAccount (int initialBalance){
        this.savingsBalance = initialBalance;
    }
    public final double calculateMonthlyInterest() {
        double monthlyInterest = this.savingsBalance * annualInterestRate / 12;
        return monthlyInterest;
    };

    public static void modifyInterestRate (double newAnnualInterest){
        annualInterestRate = newAnnualInterest;
    };
    public final double updateBalance (double monthlyInterestRate){
        return this.savingsBalance += monthlyInterestRate;
    }
    public final double getBalance (){
        return this.savingsBalance;
    }
}
