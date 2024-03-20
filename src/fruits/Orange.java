package fruits;

public class Orange extends Fruit {
    private static int count = 0;

    public Orange() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}
