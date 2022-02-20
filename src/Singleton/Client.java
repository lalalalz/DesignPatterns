package Singleton;

public class Client {
    public static void main(String[] args) {
        Runnable task1 = new Task();
        Runnable task2 = new Task();

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.run();
        thread2.run();
    }
}
