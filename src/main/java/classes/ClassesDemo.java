package classes;

public class ClassesDemo {  // klasa publiczna

    public static void main(String[] args) {
        Car car = new Car(30);
        Car car2 = new Car(50);
        System.out.println(car);
        car.runCar();
        System.out.println(car);
        System.out.println(" ");

        Car.Engine engine = car2.new Engine();
        engine.run();
        engine.run();
        System.out.println(car2);

        class LocalClass {  // klasa lokalna występuje w metodzie


        }

        LocalClass localClass = new LocalClass();

        Car fromAnonymousClass = new Car(40) {  // klasa anonimowa wykorzystuje nazwę innej klasy i automatycznie ją dziedziczy

            private int size;
            private String name;

            @Override
            public void runCar() {
                super.runCar();
                System.out.println("Brum brum");
            }
        };

        System.out.println(" ");
        fromAnonymousClass.runCar();
        System.out.println(fromAnonymousClass.getClass());

        Driver driver = new Driver() {
            @Override
            public void drive() {

            }
        };




    }


}

class Class2 {  // nastepna klasa nie może już być publiczna,    ta klasa będzie dostępna tylko w obrębie pakietu

}

class Car {

    private double fuel;
    private Engine engine = new Engine();

    public Car(double fuel) {
        this.fuel = fuel;
    }

    public void runCar() {
        engine.run();
    }

    class Engine { // klasa wewnętrzna  (klasa w klasie) --> może wykorzystywać prywatne składowe zewnętrzne
        // klasa wewnętrzna może być statyczna i wtedy jest niezależna od obiektu zewnętrznej klasy
        // do klas wewnętrznych dzałają wszystkie modyfikatory dostępu

        public void run() {
            fuel--;
        }


    }

    @Override
    public String toString() {
        return "Car{" +
                "fuel=" + fuel +
                '}';
    }


}

interface Driver {
    void drive();
}


