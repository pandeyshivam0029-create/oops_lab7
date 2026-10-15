package labsheet07.question22;

class NumberTask implements Runnable {
    @Override
    public void run() {
        for (int number = 1; number <= 10; number++) {
            System.out.println(number);
        }
    }
}

public class Question22RunnableInterface {
    public static void main(String[] args) {
        Thread thread = new Thread(new NumberTask());
        thread.start();
    }
}
