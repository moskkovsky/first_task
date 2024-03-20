package fruits;

public class Apple extends Fruit {
    private static int count = 0;

    public Apple() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}