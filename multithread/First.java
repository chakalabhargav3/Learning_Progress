package multithread;

public class First extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("First thread: " + i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }   

}
