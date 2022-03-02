package HomeWork1.firstPart;


import java.util.ArrayList;
import java.util.Arrays;

public class AnyArray<T> {

    private T[] instance;

    public AnyArray(T[] anyArray) {
        this.instance = anyArray;
    }

    public void swapPlaces(int firstIndex, int secondIndex) {
        var temp = instance[firstIndex];

        instance[firstIndex] = instance[secondIndex];
        instance[secondIndex] = temp;
    }

    public ArrayList<T> toArrayList() {
        ArrayList<T> list = new ArrayList<>();
        for (int i = 0; i < instance.length; i++) {
            list.add(instance[i]);
        }
        return list;
    }
    @Override
    public String toString() {
        return Arrays.toString(instance);


    }
}
