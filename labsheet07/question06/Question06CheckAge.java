package labsheet07.question06;

import java.util.Scanner;

public class Question06CheckAge {
    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or above.");
        }

        System.out.println("Age accepted.");
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter your age: ");
            int age = input.nextInt();

            checkAge(age);
        } catch (Exception exception) {
            System.out.println("Exception: " + exception.getMessage());
        }
    }
}
