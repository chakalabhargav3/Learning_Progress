package multithread;

public class Main {

    public static void main(String[] args) {
        First first = new First();
        Second second = new Second();

        // Thread thread1 = new Thread(() -> first.run());
        // Thread thread2 = new Thread(() -> second.run());

        first.start();
        first.setPriority(Thread.MIN_PRIORITY);
        second.start();
        second.setPriority(Thread.MAX_PRIORITY);
        System.out.println(second.getPriority());
    }
}
