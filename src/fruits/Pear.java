package fruits;

import fruits.Fruit;

public class Pear extends Fruit {
    private static int count = 0;

    public Pear() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}
