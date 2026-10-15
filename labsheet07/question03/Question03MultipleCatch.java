package labsheet07.question03;

import java.util.Scanner;

public class Question03MultipleCatch {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            String firstText = input.nextLine();

            System.out.print("Enter the second number: ");
            String secondText = input.nextLine();

            int firstNumber = Integer.parseInt(firstText);
            int secondNumber = Integer.parseInt(secondText);

            System.out.println("Result: " + (firstNumber / secondNumber));
        } catch (NumberFormatException exception) {
            System.out.println("Please enter valid whole numbers.");
        } catch (ArithmeticException exception) {
            System.out.println("The second number cannot be zero.");
        }
    }
}
