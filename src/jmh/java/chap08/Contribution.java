package chap08;

public class Contribution {
    private static int amount = 0;

    public static synchronized void donate() {
        amount++;
    }

    public int getTotal() {
        return amount;
    }
}
