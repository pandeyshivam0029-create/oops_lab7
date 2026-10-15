package labsheet07.question28;

import java.util.concurrent.CountDownLatch;

class SharedCounter {
    int value;
}

public class Question28UnsynchronizedCounter {
    public static void main(String[] args) throws InterruptedException {
        SharedCounter counter = new SharedCounter();
        CountDownLatch bothThreadsRead = new CountDownLatch(2);
        CountDownLatch allowWrites = new CountDownLatch(1);

        Runnable increment = () -> {
            int oldValue = counter.value;
            bothThreadsRead.countDown();
            try {
                allowWrites.await();
            } catch (InterruptedException exception) {
                Thread.currentThread().interrupt();
                return;
            }
            counter.value = oldValue + 1;
        };

        Thread first = new Thread(increment, "Counter-1");
        Thread second = new Thread(increment, "Counter-2");

        first.start();
        second.start();

        bothThreadsRead.await();
        allowWrites.countDown();
        first.join();
        second.join();

        System.out.println("Expected value after two increments: 2");
        System.out.println("Actual unsynchronized value: " + counter.value);
        System.out.println("Both threads read 0 before either writes, so one increment is lost.");
    }
}
