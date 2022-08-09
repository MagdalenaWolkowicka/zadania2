package collections2.set;

import collections2.set.Cow;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {

        // Sety nie przechowują powtórek

        // zwierzeta.get(0) -- nie działa

        // kolejność w hashSetach jest przypadkowa (tzn układają się wg hasha), nie można wykorzystywać kolejności

        Set<String> zwierzeta = new HashSet<>();

        zwierzeta.add("Krowa");
        zwierzeta.add("Koń");
        zwierzeta.add("Krowa");
        zwierzeta.add("Koza");

        System.out.println(zwierzeta);

        for (String s : zwierzeta) {
            System.out.println(s);
        }

        // hash to jest liczbowa reprezentacja obiektu - hashe możliwie równomiernie wykorzystują zakres int
        // hashe dwóch obiektów mogą się powtarzać
        // są często wyrażane w sestemie heksadecymalnym

        Object object = new Object();
        System.out.println(object.toString());
        System.out.println(Integer.toHexString(123));
        System.out.println("");


        // HashSet wykorzystuje metody equals + hashCode
        Set<Cow> cows = new HashSet<>();

        cows.add(new Cow("Malwa", 2));
        cows.add(new Cow("Fela", 4));

        Cow cow1 = new Cow("Yeti", 2);
        Cow cow2 = new Cow("Yeti", 2);
        Cow cow3 = cow1;
        cows.add(cow1);
        cows.add(cow3);
        System.out.println(cows);
        System.out.println("");


        // domyślnie wykorzystuje ==
        System.out.println(cow1.equals(cow2)); // false lub true (po wygenerowaniu equals)
        System.out.println(cow1.equals(cow3)); // true
        System.out.println("");

        // porównywanie przez referencje  - adresy obiektów
        System.out.println(cow1 == cow2); // false
        System.out.println(cow1 == cow3); // true

        Set<Cow> cowSet = new HashSet<>();

        for (int i = 0; i < 100_000; i++) {
            Cow randomCow = new Cow(String.valueOf((char) i), i);
            //System.out.println(randomCow);
            cowSet.add(randomCow);
        }

        long startTime = System.currentTimeMillis();
        for (Cow cow : cowSet) {
            cow.equals(cow1);
        }
        long stopTime = System.currentTimeMillis();

        long startTime2 = System.currentTimeMillis();

        for (Cow cow : cowSet) {
            cow.hashCode();
        }
        long stopTime2 = System.currentTimeMillis();


        System.out.println(stopTime - startTime);
        System.out.println(stopTime2 - startTime2);


        // w naszym teście wyszło, że metoda hashCode była wolniejsza, jednak przy wiekszej kompozycji zagnieżdżonych
        // obiektów i wielu cechach to equals jest wolniejszy
        // HashSet jest zoptymalizowany żeby jaknajrzadziej wykonywać equals i głównie wykorzystywać hashCode




    }





}
