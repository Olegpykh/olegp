package homework.homework2;

public class Homework2 {


    public static void main(String[] args) {
        System.out.println("Addition = " + addition(7, 8));
        System.out.println("Division = " + division(10, 7));
        System.out.println("Miltiplikation = " + multiplikation(10, 3));
        System.out.println("Subraktion = " + subraktion(16, 5));

    }

    private static int addition(int a, int b) {
        return a + b;

    }

    private static int division(int a, int b) {
        return a - b;
    }

    private static int multiplikation(int a, int b) {
        return a * b;
    }

    private static double subraktion(double a, double b) {
        return a / b;
    }
}

