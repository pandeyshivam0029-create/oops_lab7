package labsheet07.question05;

import java.util.Scanner;

public class Question05FinallyBlock {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("File opened.");
            System.out.print("Enter a number to divide 100 by: ");
            int denominator = input.nextInt();

            int result = 100 / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException exception) {
            System.out.println("Cannot divide by zero.");
        } finally {
            System.out.println("Resource closed.");
        }
    }
}
