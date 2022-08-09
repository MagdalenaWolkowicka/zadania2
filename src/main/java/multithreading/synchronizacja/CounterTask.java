package multithreading.synchronizacja;

import java.util.concurrent.atomic.AtomicInteger;

public class CounterTask implements Runnable {

    Thread thread1;
    Thread thread2;
    //private int counter = 0;
    private AtomicInteger atomicCounter = new AtomicInteger(0);


    public CounterTask() {
        this.thread1 = new Thread(this);
        this.thread2 = new Thread(this);
    }

    public void startAll() {
        thread1.start();
        thread2.start();
    }

    public void joinAll() {
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("ddd");
        }

    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            atomicCounter.getAndIncrement();
            //count();
        }
    }

    private synchronized void count() {  // metoda zsynchronizowana, czyli że 1 wątek skończy i dopiero 2 zaczyna
        //counter++;
    }

    public AtomicInteger getCounter() {
        return atomicCounter;
    }

    public static void main(String[] args) {

        CounterTask counterTask = new CounterTask();  // przygotuj wątki i zadanie
        counterTask.startAll();  // sygnał do rozpoczęcia pracy
        counterTask.joinAll();  // join --> idz dalej dopiero jak skończą
        System.out.println(counterTask.getCounter());  // jaki wynik
    }


}


// wait / notify
// lock
//deadlock
//thread pool
//feature