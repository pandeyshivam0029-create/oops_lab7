package labsheet07.question30;

public class Question30MultithreadingExample {
    public static void main(String[] args) throws InterruptedException {
        Thread downloadTask = new Thread(() -> {
            for (int percent = 25; percent <= 100; percent += 25) {
                System.out.println("Download thread: " + percent + "% downloaded.");
            }
        }, "Download");

        Thread processingTask = new Thread(() -> {
            for (int part = 1; part <= 4; part++) {
                System.out.println("Processing thread: processed part " + part + ".");
            }
        }, "Processing");

        downloadTask.start();
        processingTask.start();

        downloadTask.join();
        processingTask.join();

        System.out.println("Main thread: download and processing are complete.");
    }
}
