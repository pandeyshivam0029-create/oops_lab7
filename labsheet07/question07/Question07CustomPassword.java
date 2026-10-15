package labsheet07.question07;

import java.util.Scanner;

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

public class Question07CustomPassword {
    static void checkPassword(String password) throws InvalidPasswordException {
        if (password.length() < 6) {
            throw new InvalidPasswordException("Password must have at least 6 characters.");
        }

        System.out.println("Password accepted.");
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a password: ");
            String password = input.nextLine();

            try {
                checkPassword(password);
            } catch (InvalidPasswordException exception) {
                System.out.println("Invalid password: " + exception.getMessage());
            }
        }
    }
}
