package labsheet07.question01;

import java.util.Scanner;

public class Question01Division {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the numerator: ");
            int numerator = input.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = input.nextInt();

            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException exception) {
            System.out.println("Cannot divide by zero.");
        } finally {
            System.out.println("Division operation finished.");
        }
    }
}
