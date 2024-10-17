package lessons.TotalLEsson11_10;

import java.util.Scanner;

public class Lesson11_10 {



        public static void main(String[] args) {
            Integer[] test = {1, 2, 3, 4, 5};
            System.out.println("element = " + test[2]);
            Integer[] testTwo = new Integer[10];
            for (int i = 0; i < testTwo.length; i++) {
                System.out.print(testTwo[i]+ " ");
            }
            Scanner  sc= new Scanner(System.in);
            System.out.println();
            System.out.println("а теперь введем значения:");
            for (int i = 0; i < testTwo.length; i++) {
                System.out.print("Ввведи значение для ячейки " + i + ": ");
                testTwo[i] = sc.nextInt();
                System.out.println();
            }

            for (int i = 0; i < testTwo.length; i++) {
                System.out.print(testTwo[i]+ " ");
            }
        }
}
