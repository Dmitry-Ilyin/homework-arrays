package TaskOne;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Random;

public class MyArrays {
    public static void main(String[] args) {
        int[] array = new Random().ints(20, -10, 11).limit(20).toArray();
        System.out.println(Arrays.toString(array));
        int minPositive = Arrays.stream(array)
                .filter(i -> i > 0)
                .min()
                .orElseThrow(NoSuchElementException::new);
        System.out.println("Минимальный положительный элемент : " + minPositive);

        int maxNegative = Arrays.stream(array)
                .filter(i -> i < 0)
                .max()
                .orElseThrow(NoSuchElementException::new);
        System.out.println("Максимальный отрицательный элемент : " + maxNegative);

        int indexMinPositiveElement = 0;
        int indexMaxNegativeElement = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == minPositive) {
                indexMinPositiveElement = i;
                System.out.println("Индекс минимального положительного элемента : " + indexMinPositiveElement);
                break;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxNegative) {
                indexMaxNegativeElement = i;
                System.out.println("Индекс максимального отрицательного элемента : " + indexMaxNegativeElement);
                break;
            }
        }

        array[indexMinPositiveElement] = maxNegative;
        array[indexMaxNegativeElement] = minPositive;
        System.out.println(Arrays.toString(array));
    }
}
