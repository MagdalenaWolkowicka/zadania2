package collections2.sort;

import java.util.LinkedList;
import java.util.List;

public class BubbleSort {

    public void sort(List<Integer> numbers) {
        System.out.println("Sortujemy!");

        for (int j = 0; j < numbers.size() - 1; j++) {
            for (int i = 0; i < numbers.size() - 1 - j; i++) {
                int first = numbers.get(i);
                int second = numbers.get(i + 1);
                if (first > second) {   // aby zmienic koilejność wystarczy zmienic znak
                    numbers.set(i, second);
                    numbers.set(i + 1, first);
                }
            }
        }


    }
}

     class SortingDemo {

         public static void main(String[] args) {
             BubbleSort bubbleSort = new BubbleSort();
             List<Integer> numbers = new LinkedList<>(List.of(12,34,9,55,44,1,7,99,2,44));
             bubbleSort.sort(numbers);
             for (Integer number : numbers) {
                 System.out.print(number + " ");
             }

         }


     }