import Fruit.Orange;

import java.util.ArrayList;

/**
 * 1. Написать метод, который меняет два элемента массива местами.
 * (массив может быть любого ссылочного типа);
 */
public class ex1 {
    static void swapObj(Object[] array, int firstIndex, int secondIndex){
        Object oneV1 = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = oneV1;
    }
    /**
     * 2. Написать метод, который преобразует массив в ArrayList;
     */
    static <T> ArrayList<T> convertToList(T[] array){
    return new ArrayList<>(ArrayList.asList(array));
    }
}
