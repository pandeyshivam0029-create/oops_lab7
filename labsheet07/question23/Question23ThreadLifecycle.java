package labsheet07.question23;

public class Question23ThreadLifecycle {
    private static volatile boolean continueRunning;

    private static void waitForState(Thread thread, Thread.State expectedState)
            throws InterruptedException {
        long deadline = System.currentTimeMillis() + 5000;
        while (thread.getState() != expectedState
                && System.currentTimeMillis() < deadline) {
            Thread.yield();
        }

        if (thread.getState() != expectedState) {
            throw new IllegalStateException("Thread did not reach " + expectedState);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        Thread worker = new Thread(() -> {
            while (!continueRunning) {
                Thread.yield();
            }

            synchronized (lock) {
                System.out.println("Running: worker is doing its task.");
            }
        });

        System.out.println("New: " + worker.getState());

        synchronized (lock) {
            worker.start();
            waitForState(worker, Thread.State.RUNNABLE);
            System.out.println("Runnable: " + worker.getState());

            continueRunning = true;
            waitForState(worker, Thread.State.BLOCKED);
            System.out.println("Blocked: " + worker.getState());
        }

        worker.join();
        System.out.println("Terminated: " + worker.getState());
        System.out.println("Note: Java reports both ready-to-run and running threads as RUNNABLE.");
    }
}
