package practice;

import java.util.Scanner;

public class Oleg2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl ein :");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x > 0 && y > 0) {
            System.out.println(1);
        }
        if (x > 0 && y < 0) {
            System.out.println(2);
        }
        if (x < 0 && y > 0) {
            System.out.println(3);
        }
        if (x < 0 && y < 0) {
            System.out.println(4);
        }



    }
}
