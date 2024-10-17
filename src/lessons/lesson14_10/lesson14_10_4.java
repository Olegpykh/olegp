package lessons.lesson14_10;

import java.util.Scanner;

public class lesson14_10_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число : ");
        int x = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= x; i++) {
            factorial = factorial * i;


        }
        System.out.println(factorial);

    }



}
