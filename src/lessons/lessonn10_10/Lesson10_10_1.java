package lessons.lessonn10_10;

public class Lesson10_10_1 {
    public static void main(String[] args) {
        for (int i = 0; i >= 0; i++) {
            if (i % 10 == 0) {
                continue;
            }
            System.out.println(i);
            if (i >= 99) {
                break;
            }
        }

    }
}
