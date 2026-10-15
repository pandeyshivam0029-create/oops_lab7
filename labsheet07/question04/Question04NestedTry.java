package labsheet07.question04;

import java.util.Scanner;

public class Question04NestedTry {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        try (Scanner input = new Scanner(System.in)) {
            try {
                System.out.print("Enter the numerator: ");
                int numerator = input.nextInt();

                System.out.print("Enter the denominator: ");
                int denominator = input.nextInt();

                int result = numerator / denominator;
                System.out.println("Division result: " + result);

                try {
                    System.out.print("Enter an array index from 0 to 4: ");
                    int index = input.nextInt();
                    System.out.println("Value at index " + index + ": " + numbers[index]);
                } catch (ArrayIndexOutOfBoundsException exception) {
                    System.out.println("Invalid array index. Use an index from 0 to 4.");
                }
            } catch (ArithmeticException exception) {
                System.out.println("Cannot divide by zero.");
            }
        }
    }
}
