package fruits;

public class Fruit {
    private static int count = 0;

    public Fruit() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}
