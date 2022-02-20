package Singleton;

public class Task implements Runnable {

    @Override
    public void run() {
        Singleton instance = Singleton.Instance();
    }
}
