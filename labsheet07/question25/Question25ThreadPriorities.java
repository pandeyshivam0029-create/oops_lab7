package labsheet07.question25;

class PriorityTask extends Thread {
    public PriorityTask(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + " started with priority " + getPriority());
    }
}

public class Question25ThreadPriorities {
    public static void main(String[] args) throws InterruptedException {
        Thread low = new PriorityTask("Low priority");
        Thread normal = new PriorityTask("Normal priority");
        Thread high = new PriorityTask("High priority");

        low.setPriority(Thread.MIN_PRIORITY);
        normal.setPriority(Thread.NORM_PRIORITY);
        high.setPriority(Thread.MAX_PRIORITY);

        low.start();
        normal.start();
        high.start();

        low.join();
        normal.join();
        high.join();

        System.out.println("Priority is only a scheduling hint; it does not guarantee which thread starts first.");
    }
}
