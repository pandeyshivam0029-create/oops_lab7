package labsheet07.question29;

class SafeCounter {
    private int value;

    public synchronized void increment() {
        value++;
    }

    public int getValue() {
        return value;
    }
}

public class Question29SynchronizedCounter {
    public static void main(String[] args) throws InterruptedException {
        SafeCounter counter = new SafeCounter();
        Runnable incrementManyTimes = () -> {
            for (int i = 0; i < 100000; i++) {
                counter.increment();
            }
        };

        Thread first = new Thread(incrementManyTimes);
        Thread second = new Thread(incrementManyTimes);

        first.start();
        second.start();
        first.join();
        second.join();

        System.out.println("Expected value: 200000");
        System.out.println("Actual synchronized value: " + counter.getValue());
    }
}
