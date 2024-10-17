package lessons.lesson09_10;

public class lesson09_10_5 {
    public static void main (String[] args) {
        int from = 100;
        int to = 10000;

        getAllOdd(from, to);
    }

    private static void getAllOdd(int from, int to) {
        for (int i = from; i <= to; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
