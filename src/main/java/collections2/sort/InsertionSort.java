package collections2.sort;

import java.util.LinkedList;
import java.util.List;

public class InsertionSort {

    public void sort(List<Integer> numbers) {     // nie jest gotowe...
        for (int i = 1; i < numbers.size() - 1; i++) {
            for (int j = i; j > 0; j--) {
                int first = numbers.get(i);
                int second = numbers.get(i - 1);
                if (first < second) {
                    numbers.set(i, second);
                    numbers.set(i - 1, first);
                }
            }

        }

    }


}


class InsertionSortDemo {

    public static void main(String[] args) {

        List<Integer> numbers = new LinkedList<>(List.of(12, 34, 9, 55, 44, 1, 7, 99, 2, 44));

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(numbers);
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }


    }
}
