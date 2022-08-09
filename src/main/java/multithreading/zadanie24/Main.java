package multithreading.zadanie24;

public class Main {
    public static void main(String[] args) {

        Task task = new Task();

        Thread worker = new Thread(task);
        worker.start();


        Runnable newTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000; i++) {
                    System.out.println(i + ". To jest kolejny wątek!");
                }
            }
        };
        Thread newWorker = new Thread(newTask);
        newWorker.start();
    }
}


/*

Stwórz w main nowy wątek na dwa różne sposoby.
Deklarując klasę Task, implementującą interfejs Runnable oraz wykorzystując anonimową klasę implementującą Runnable.
Oba wątki mają drukować 10_000 razy dowolny tekst oraz numer bieżącej iteracji (zmienna i z pętli).

 */