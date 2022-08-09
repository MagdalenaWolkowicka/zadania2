package functionalProgramming.zadanie22;

import java.util.Locale;

public class Task {
    public static void main(String[] args) {

        Printer scream = (text) -> text.toUpperCase(Locale.ROOT) + "!";
        System.out.println(scream.print("domek"));



    }
}

interface Printer {
    abstract String print (String text);
}


/*


Stwórz interfejs Printer, posiadający jedną metodę, print, przyjmującą argument typu String, wykorzystaj ten interfejs do zaimplementowania lambdą funkcji:

funkcja krzycząca, która wyświetla tekst wielkimi literami i dodaje wykrzyknik
funkcja wyświetlająca napis stworzony z pierwszej litery każdego słowa (trudne)


 */