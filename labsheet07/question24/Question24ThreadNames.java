package labsheet07.question24;

class NamedTask extends Thread {
    public NamedTask(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " is working: " + i);
        }
    }
}

public class Question24ThreadNames {
    public static void main(String[] args) throws InterruptedException {
        Thread first = new NamedTask("Thread-A");
        Thread second = new NamedTask("Thread-B");

        first.start();
        second.start();

        first.join();
        second.join();

        System.out.println("Both threads finished. Their lines can appear in any order because the scheduler chooses when each runs.");
    }
}
