package HW7;

public class programToTest {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        SavingsAccount.modifyInterestRate(0.04);

        System.out.println(
                        "####### Saver 1 #######" +
                        "\nCurrent balance: " + saver1.getBalance() + " $" +
                        "\nCurrent annual interest rate: " + (SavingsAccount.annualInterestRate * 100) + " %" +
                        "\nMonthly interest: " + saver1.calculateMonthlyInterest() + " $" +
                        "\nNext month balance: " + saver1.updateBalance(saver1.calculateMonthlyInterest()) + " $"
        );

        System.out.println(
                        "\n####### Saver 2 #######" +
                        "\nCurrent balance: " + saver2.getBalance() + " $" +
                        "\nCurrent annual interest rate: " + (SavingsAccount.annualInterestRate * 100) + " %" +
                        "\nMonthly interest: " + saver2.calculateMonthlyInterest() + " $" +
                        "\nNext month balance: " + saver2.updateBalance(saver2.calculateMonthlyInterest()) + " $"
        );


        SavingsAccount.modifyInterestRate(0.05);

        System.out.println(
                        "\n####### Saver 1 #######" +
                        "\nCurrent balance: " + saver1.getBalance() + " $" +
                        "\nCurrent annual interest rate: " + (SavingsAccount.annualInterestRate * 100) + " %" +
                        "\nMonthly interest: " + saver1.calculateMonthlyInterest() + " $" +
                        "\nNext month balance: " + saver1.updateBalance(saver1.calculateMonthlyInterest()) + " $"
        );

        System.out.println(
                        "\n####### Saver 2 #######" +
                        "\nCurrent balance: " + saver2.getBalance() + " $" +
                        "\nCurrent annual interest rate: " + (SavingsAccount.annualInterestRate * 100) + " %" +
                        "\nMonthly interest: " + saver2.calculateMonthlyInterest() + " $" +
                        "\nNext month balance: " + saver2.updateBalance(saver2.calculateMonthlyInterest()) + " $"
        );

    }
}
