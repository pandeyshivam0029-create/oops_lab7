package labsheet07.question08;

import java.util.Scanner;

public class Question08ThrowsKeyword {
    static int readNumber(Scanner input) throws NumberFormatException {
        System.out.print("Enter a whole number: ");
        String numberText = input.nextLine();
        return Integer.parseInt(numberText);
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            try {
                int number = readNumber(input);
                System.out.println("You entered: " + number);
            } catch (NumberFormatException exception) {
                System.out.println("That is not a valid whole number.");
            }
        }
    }
}
