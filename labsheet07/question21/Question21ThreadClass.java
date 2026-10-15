package labsheet07.question21;

class MessageThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello from the thread. Message " + i);
        }
    }
}

public class Question21ThreadClass {
    public static void main(String[] args) {
        MessageThread thread = new MessageThread();
        thread.start();
    }
}
