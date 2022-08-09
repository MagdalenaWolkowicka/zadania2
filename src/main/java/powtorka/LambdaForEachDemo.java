package powtorka;

import java.awt.event.ActionListener;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdaForEachDemo {
    public static void main(String[] args) {

        // Consumer : (a) -> void  cos przyjmuje, nic nie zwraca
        // Supplier : () -> a      nic nie przyjmuje, cos zwraca
        // Function : (T) -> E     przyjmuje jakis typ, ale zwraca inny
        // Operator : (T) -> T     ten sam typ przyjmuje i ten sam zwraca
        // Predicate : (T) -> boolean
        // Runnable : () -> void
        // Comparator : (T, T) -> int   przyjmuje 2 rzeczy tego samego typu, zwraca int
        // ActionListener : (ActionEvent) -> void   przyjmuje actionevent, zwraca void


        List<String> names = new ArrayList<>();
        names.add("Ada");
        names.add("Ala");
        names.add("Adam");



        // wyswietlanie imion z iloscia znakow 3
        for (String name : names) {
            if (name.length() == 3) {
                System.out.println(name);
            }
        }
        System.out.println("");

        // inna metoda (z anonimowa klasa)
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String name) {
                if (name.length() == 3) {
                    System.out.println(name);
                }
            }
        });
        System.out.println(" ");

        // jeszczcze inna metoda (z lambda)
        names.forEach((name) -> {             // tu można pominąć String! i tylko dac name, bo jest tylko 1 parametr metody
                    if (name.length() == 3) {
                        System.out.println(name);
                    }
                }
        );



    }
}
