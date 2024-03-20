import fruits.Apple;
import fruits.Fruit;
import fruits.Orange;
import fruits.Pear;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List <Fruit> fruits = new ArrayList<>();

        Apple apple_first = new Apple();
        Apple apple_second = new Apple();
        Apple apple_third = new Apple();
        Pear pear_first = new Pear();
        Pear pear_second = new Pear();
        Orange orange = new Orange();

        fruits.add(apple_first);
        fruits.add(apple_second);
        fruits.add(apple_third);
        fruits.add(pear_first);
        fruits.add(pear_second);
        fruits.add(orange);

        int countFruits = 0;
        int countApples = 0;
        int countPears = 0;
        int countOranges = 0;

        for (Fruit fruit : fruits) {
            countFruits += fruit.getCountFruits();
            if (fruit instanceof Apple) {
                countApples += fruit.getCountFruits();
            } else if (fruit instanceof Pear) {
                countPears += fruit.getCountFruits();
            } else if (fruit instanceof Orange) {
                countOranges += fruit.getCountFruits();
            }
        }

        System.out.println("Количество всех фруктов: " + countFruits);
        System.out.println("Количество яблок: " + countApples);
        System.out.println("Количество груш: " + countPears);
        System.out.println("Количество апельсинов: " + countOranges);
    }
}