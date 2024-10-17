package lessons.lessonn10_10;

public class Lesson10_10_3 {


    public static void main(String[] args) {
        printHello();
        printEvenNumbers(8);
    }

    //1. Создайте метод, при вызове которого печатается 5 раз “Hello my friend !”
    private static void printHello() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello my friend !");
        }
    }

    //2. Создайте метод, который принимает число и выводит в консоль только
    //четные вхождения в это число
    //Например:
    //Вход = 5, выход = 2, 4
    private static void printEvenNumbers(int number) {
        for (int i = 2; i <= number; i+=2) {
            System.out.println(i);
        }
    }
}
