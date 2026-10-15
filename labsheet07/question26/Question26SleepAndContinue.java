package labsheet07.question26;

public class Question26SleepAndContinue {
    public static void main(String[] args) throws InterruptedException {
        Thread sleepingThread = new Thread(() -> {
            System.out.println("Sleeping thread: going to sleep for 2 seconds.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException exception) {
                Thread.currentThread().interrupt();
                System.out.println("Sleeping thread was interrupted.");
                return;
            }
            System.out.println("Sleeping thread: awake now.");
        });

        Thread workingThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Working thread: step " + i);
            }
        });

        sleepingThread.start();
        workingThread.start();

        sleepingThread.join();
        workingThread.join();
        System.out.println("The sleeping thread does not stop the other thread.");
    }
}
