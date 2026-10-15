package labsheet07.question27;

public class Question27JoinThreads {
    public static void main(String[] args) throws InterruptedException {
        Thread first = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("First thread: step " + i);
            }
        });

        Thread second = new Thread(() ->
                System.out.println("Second thread starts after the first thread finishes."));

        first.start();
        first.join();

        second.start();
        second.join();

        System.out.println("Main thread: both threads have finished.");
    }
}
