package TaskOne;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Random;

public class MyArrays {
    public static void main(String[] args) {
        int[] array = new Random().ints(20, -10, 11).limit(20).toArray();
        System.out.println(Arrays.toString(array));
        int max = Arrays.stream(array).max().orElseThrow(NoSuchElementException::new);
        System.out.println("Максимальный элемент : " + max);
        int min = Arrays.stream(array).min().orElseThrow(NoSuchElementException::new);
        System.out.println("Минимальный элемент : " + min);
        int indexMaxElement = 0;
        int indexMinElement = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                indexMaxElement = i;
                System.out.println("Индекс максимального элемента : " + indexMaxElement);
                break;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                indexMinElement = i;
                System.out.println("Индекс минимального элемента : " + indexMinElement);
                break;
            }
        }
        int temp = array[indexMaxElement];
        array[indexMaxElement] = array[indexMinElement];
        array[indexMinElement] = temp;
        System.out.println(Arrays.toString(array));
    }
}
