package labsheet07.question09;

public class Question09FinallyAndReturn {
    static int getNumber() {
        try {
            System.out.println("Inside try: preparing to return a value.");
            return 10;
        } finally {
            System.out.println("Inside finally: this runs before the method returns.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Returned value: " + getNumber());
    }
}
