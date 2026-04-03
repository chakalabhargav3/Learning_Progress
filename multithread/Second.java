package multithread;

public class Second extends Thread {

    public void run() {
        for (int i = 0; i < 105; i++) {
            System.out.println("Second thread: " + i);
        }
    }

}
