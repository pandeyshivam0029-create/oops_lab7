package labsheet07.question10;

import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount < 0) {
            throw new IllegalArgumentException("Withdrawal amount cannot be negative.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Not enough money in the account.");
        }

        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
}

public class Question10BankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.0);

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the amount to withdraw (balance: 500): ");
            double amount = input.nextDouble();

            try {
                account.withdraw(amount);
            } catch (InsufficientFundsException exception) {
                System.out.println("Withdrawal failed: " + exception.getMessage());
            } catch (IllegalArgumentException exception) {
                System.out.println("Invalid amount: " + exception.getMessage());
            }
        }
    }
}
