package homework.homework3;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 слова: ");
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();

        if ((word1.length() + word2.length()) % 2 == 1) {
            System.out.println("Falsches Eingeben");
            return;
        }
        System.out.println(word1.substring(0, word1.length() / 2) + (word2.substring(word2.length() / 2)));


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

