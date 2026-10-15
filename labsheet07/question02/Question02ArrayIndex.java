package labsheet07.question02;

import java.util.Scanner;

public class Question02ArrayIndex {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter an index from 0 to 4: ");
            int index = input.nextInt();

            System.out.println("Value at index " + index + ": " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Invalid index. The array has indexes from 0 to 4.");
        }
    }
}
