package multithreading.zadanie25;

public class ConcatenationTask implements Runnable {

    private int count;
    private String text;
    private String result = "";
    private Thread thread;
    private boolean running = true;

    public ConcatenationTask(int count, String text) {
        this.count = count;
        this.text = text;
        thread = new Thread(this);
    }

    public void startTask() {
        // uruchamia zadanie
        thread.start();

    }

    public void abort() {
        // przerywa zadanie
        running = false;
    }


    public String getResult() {
        return result;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            result += text;
            if (!running) {
                System.out.println("Aborting");
                break;
            }
        }
    }


    public void waitUntilEnd() {
try {
    thread.join();
} catch (InterruptedException e) {
        e.getMessage();
}
    }


}
