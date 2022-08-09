package streams.zadanie30;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(List.of(9, 2, 3, 70, 1, 2, 5, 9, 4, 8));

        // wyświetlam
        numbers.forEach(number -> System.out.print(number + " "));

        System.out.println(" ");

        // sortuję
        numbers.stream()
                .sorted()
                .forEach(number -> System.out.print(number + " "));
        System.out.println("");

        // wyswieltl parzyste (odfiltruj nieparzyste)
       long result =  numbers.stream()
                .filter(number -> number % 2 == 0)
                .count();
        System.out.println(result);

        // wyswielt liczby ponizej 50 i zbierz do nowej listy
        List<Integer> filtered = numbers.stream()
                .filter(number -> number < 50)
                .collect(Collectors.toList());
        System.out.print(filtered + " ");
        System.out.println(" ");

        // posortuj malejąco a potem pobierz pierwszą metodą find First
        int numberFound = numbers.stream()
                .sorted((number1, number2) -> number2 - number1)
                .findFirst()  // zwraca Optional a nie int
                .get();
        System.out.println(numberFound);



    }
}






/*

Przygotuj ArrayList z 10 liczbami z przedziału 0-100.
za pomocą metody forEach wyświetl wszystkie liczby
za pomocą streama posortuj liczby i wyświetl posortowane
za pomocą streama odfiltruj liczby nieparzyste i policz ile pozostało elementów funkcją kończącą count()
za pomocą streama odfiltruj wszystkie liczby powyżej 50, pozostałe liczby zbierz do nowej listy
za pomocą streama posortuj liczby malejąco a następnie pobierz pierwszą z nich metodą findFirst

 */