package practice1;

import java.util.Scanner;

public class Oleg {

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
    }

}















