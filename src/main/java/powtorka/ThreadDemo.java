package powtorka;

public class ThreadDemo {

    public static void main(String[] args) {

//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello!");
//            }
//        });
//
//        thread.start();


        Thread thread =  new Thread(() ->System.out.println("Hello"));
        thread.start();
    }
}
