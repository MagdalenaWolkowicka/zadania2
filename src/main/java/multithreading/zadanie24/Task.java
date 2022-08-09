package multithreading.zadanie24;

public class Task implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10_000; i++) {
            System.out.println(i + ". Nowy wątek to ja!");
        }
    }
}
