package collections2.sort;

import collections2.set.Cow;

import java.util.LinkedList;
import java.util.List;

public class CowSortingAlgorithm {

    public void sort(List<Cow> cows, CowComparator cowComparator) {
        System.out.println("Sortujemy!");

        for (int j = 0; j < cows.size() - 1; j++) {
            for (int i = 0; i < cows.size() - 1 - j; i++) {
                Cow first = cows.get(i);
                Cow second = cows.get(i + 1);
                if (cowComparator.compareCows(first, second) > 0) {   // aby zmienic koilejność wystarczy zmienic znak
                    cows.set(i, second);
                    cows.set(i + 1, first);
                }
            }
        }


    }

    public int compare(Cow cow1, Cow cow2) {
        return cow1.getName().compareTo(cow2.getName());
    }

    public int compare2(Cow cow1, Cow cow2) {
        if (cow1.getAge() > cow2.getAge()) {
            return 1;
        } else if (cow1.getAge() < cow2.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }
}

interface CowComparator {

    int compareCows(Cow cow1, Cow cow2);
}

class CowSortingDemo {

    public static void main(String[] args) {
        CowSortingAlgorithm cowSortingAlgorithm = new CowSortingAlgorithm();
        List<Cow> cows = new LinkedList<>(List.of(
                new Cow("Basia", 7),
                new Cow("Fela", 3),
                new Cow("Werka", 2),
                new Cow("Eliza", 8)
        ));
        cowSortingAlgorithm.sort(cows, new CowComparator() {
            @Override
            public int compareCows(Cow cow1, Cow cow2) {
                return -cow1.getName().compareTo(cow2.getName());
            }
        });
        for (Cow cow : cows) {
            System.out.print(cow + " ");
        }

    }


}
