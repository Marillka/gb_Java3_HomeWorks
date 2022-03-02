package HomeWork1.firstPart;

import java.util.ArrayList;
/**\
 * 1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
 * 2. Написать метод, который преобразует массив в ArrayList;
 */
public class Example {

    public static void main(String[] args) {

        AnyArray<Integer> arr = new AnyArray<>(new Integer[]{1, 1, 1, 0, 0, 0});
        System.out.println(arr.toString());
        arr.swapPlaces(4, 1);
        System.out.println(arr.toString());
        System.out.println();


        ArrayList<Integer> list = arr.toArrayList();
        System.out.println(list.toString() + " - " + list.getClass().getSimpleName());

    }

}
