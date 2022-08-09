package multithreading;

public class ThreadsDemo2 {
    public static void main(String[] args) throws InterruptedException {


        Runnable task = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1_000; i++) {
                    System.out.println("Przygotowuję element A");
                }
            }
        };

        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1_000; i++) {
                    System.out.println("Przygotowuję element B");
                }
            }
        };
        Thread worker = new Thread(task);
        Thread worker2 = new Thread(task2);

        worker.start();
        worker2.start();

        worker.join();   // czekanie aż 1 wątek skończy
        System.out.println("WĄTEK 1 KOŃCZY");
        worker2.join();  // czekanie aż 2 wątek skończy
        System.out.println("WĄTEK 2 KOŃCZY");

        for (int i = 0; i < 1_000; i++) {  // chcę żeby to się wykonywało dopiero po skończeniu pracy obu wątków
            System.out.println("Wykorzystujemy wyniki pracy z obu wątków A i B!!!!!!");
        }

    }
}
