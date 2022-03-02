package HomeWork1.secondPart;

/**
 * a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
 * b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
 * c. Для хранения фруктов внутри коробки можете использовать ArrayList;
 * d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
 * e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той, которую подадут в compare в качестве параметра, true - если их веса равны, false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
 * f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку(помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами), соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;
 * g. Не забываем про метод добавления фрукта в коробку.
 */
public class Example {
    public static void main(String[] args) {

        Box<Apple> appleBox = new Box<>();
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Apple apple5 = new Apple();
        Apple apple6 = new Apple();
        Apple apple7 = new Apple();
        Apple apple8 = new Apple();
        Apple apple9 = new Apple();
        Apple apple10 = new Apple();
        Apple apple11 = new Apple();
        Apple apple12 = new Apple();
        appleBox.addFruit(apple1);
        appleBox.addFruit(apple2);
        appleBox.addFruit(apple3);
        appleBox.addFruit(apple4);
        appleBox.addFruit(apple5);
        appleBox.addFruit(apple6);
        appleBox.addFruit(apple7);
        appleBox.addFruit(apple8);
        appleBox.addFruit(apple9);
        appleBox.addFruit(apple10);
        appleBox.addFruit(apple11);
        appleBox.addFruit(apple12);
        System.out.println(appleBox.getWeight());


        Box<Orange> orangeBox = new Box<>();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();
        Orange orange5 = new Orange();
        orangeBox.addFruit(orange1);
        orangeBox.addFruit(orange2);
        orangeBox.addFruit(orange3);
        orangeBox.addFruit(orange4);
        orangeBox.addFruit(orange5);
        System.out.println(orangeBox.getWeight());


        Box<Orange> orangeBox1 = new Box<>();
        Orange orange6 = new Orange();
        Orange orange7 = new Orange();
        Orange orange8 = new Orange();
        orangeBox1.addFruit(orange6);
        orangeBox1.addFruit(orange7);
        orangeBox1.addFruit(orange8);
        System.out.println(orangeBox1.getWeight());

        orangeBox.boxToBox(orangeBox1);
        System.out.println(orangeBox.getWeight());
        System.out.println(orangeBox1.getWeight());


        System.out.println(orangeBox1.compare(appleBox));


    }
}
