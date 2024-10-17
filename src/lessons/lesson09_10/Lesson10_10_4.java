package lessons.lesson09_10;

public class Lesson10_10_4 {

    public static void main(String[] args) {
        int a = 2;
        int b = 3;

    }

    private static int getSum(int a, int b) {
        int max = Math.max(a, b);
        int sum = 0;
        for (int i = 1; i <= max; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
