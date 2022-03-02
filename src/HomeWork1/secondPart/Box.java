package HomeWork1.secondPart;

import java.util.ArrayList;

public class Box<T> {

    private double weight = 0.0;
    private ArrayList<T> list = new ArrayList<>();

    public void addFruit(T fruit) {
        list.add(fruit);
    }

    public void removeFruit(T fruit) {
        list.remove(fruit);
    }

    public double getWeight() {
        try {
            if (list.get(0) instanceof Apple) {
                weight = list.size() * 1.0;
                return weight;
            }

            if (list.get(0) instanceof Orange) {
                weight = list.size() * 1.5;
                return weight;
            }

        } catch (IndexOutOfBoundsException e) {
            return 0.0;
        }

        return weight;
    }

    public void boxToBox(Box<T> anotherBox) {
        for (int i = 0; i < this.list.size(); i++) {
            anotherBox.addFruit(this.list.get(i));
        }
        this.list.clear();
    }

    public boolean compare(Box another) {
        if (this.weight == another.weight) {
            return true;
        }
        return false;
    }
}
