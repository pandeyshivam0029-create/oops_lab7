package labsheet07.question18;

import java.util.ArrayList;
import java.util.Scanner;

public class Question18JavaUtil {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("How many names do you want to enter? ");
            int count = input.nextInt();
            input.nextLine();

            for (int i = 0; i < count; i++) {
                System.out.print("Enter name " + (i + 1) + ": ");
                names.add(input.nextLine());
            }
        }

        System.out.println("Names: " + names);
    }
}
