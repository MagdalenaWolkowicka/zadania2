package collections2.sort;

import classes.zadanieKlasyAnonimowe.Tree;
import collections2.set.Cow;

import java.util.*;

public class OriginalJavaSort {

    public static void main(String[] args) {
        List<Cow> cows = new LinkedList<>(List.of(
                new Cow("Basia", 7),
                new Cow("Fela", 3),
                new Cow("Werka", 2),
                new Cow("Eliza", 8)
        ));
        Comparator<Cow> cowComparator = new Comparator<Cow>() {
            @Override
            public int compare(Cow o1, Cow o2) {
                return o1.getAge() - o2.getAge();
            }
        };
        cows.sort(cowComparator);
        System.out.println(cows);
        System.out.println(" ");


        // LinkedHashSet pamięta kolejność
        LinkedHashSet<String > zwierzęta = new LinkedHashSet<>();
        zwierzęta.add("Krowa");
        zwierzęta.add("Pies");
        zwierzęta.add("Okoń");
        zwierzęta.add("Koń");

        System.out.println(zwierzęta);

        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };

        // TreeSet układa alfabetycznie, chyba że każemy mu inaczej jak w tym przypadku po długości Stringa
        // w tym przypadku znikneły wyrazy z powtarzajacą się liczbą liter (bo Set uważa ze to powtórka)
        TreeSet<String > zwierzęta2 = new TreeSet<>(stringComparator);
        zwierzęta2.add("Krowa");
        zwierzęta2.add("Pies");
        zwierzęta2.add("Okoń");
        zwierzęta2.add("Koń");

        System.out.println(zwierzęta2);


        // TreeSet domyslnie wykorzystuje natural order, czyli domyślny sposób sortowania zdefiniowany
        // przez obiekt sortowany w jego klasie, poprzez zaimplementowanie interfejsu Comparable
        Set<Cow> cowSet = new TreeSet<>(List.of(
                new Cow("Basia", 7),
                new Cow("Fela", 3),
                new Cow("Werka", 3),
                new Cow("Eliza", 8)
        ));

        System.out.println(cowSet);
        System.out.println(" ");


        // Tu mamy listę, więc używając Collection.sort lista jest sortowana naturalnie
        // czyli po age, a jak age taki sam to alfabetycznie
        List<Cow> cowList = new ArrayList<>(List.of(
                new Cow("Basia", 7),
                new Cow("Fela", 3),
                new Cow("Werka", 3),
                new Cow("Eliza", 8)
        ));

        System.out.println(cowList);

        Collections.sort(cowList);
        System.out.println(cowList);

        // Jesli używamy standardowego sortowania na jeden sposób to najlepiej implementować w klasie
        // inferfehs Comparable i nadpisać metodę comapareTo w samym obiekcie
        // A jeżeli chcemy mieć sortowanie na rżne sposoby to Comparator!


    }



}
