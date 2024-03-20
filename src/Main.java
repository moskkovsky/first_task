import fruits.Apple;
import fruits.Fruit;
import fruits.Orange;
import fruits.Pear;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Apple apple_first = new Apple();
        Apple apple_second = new Apple();
        Apple apple_third = new Apple();
        Pear pear_first = new Pear();
        Pear pear_second = new Pear();
        Orange orange = new Orange();


        System.out.println("Количество всех фруктов: " + Fruit.getCount());
        System.out.println("Количество яблок: " + Apple.getCount());
        System.out.println("Количество груш: " + Pear.getCount());
        System.out.println("Количество апельсинов: " + Orange.getCount());
    }
}