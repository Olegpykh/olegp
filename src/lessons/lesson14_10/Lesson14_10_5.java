package lessons.lesson14_10;

import java.util.Scanner;

public class Lesson14_10_5 {

    public static void main(String[] args) {
getFibonacci(20);

        int M = 5;
        int N = 8;
        for (int y = 0; y <= M; y++) {
            for (int x = 0; x <= N; x++) {
                if (x == 0 && y <= M || y == 0 && x <= N || y <= M && x == N || y == M && x <= N) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }


        public static void getFibonacci(int num) {
            int num0 = 1;
            int num1 = 1;
            int num2;
            System.out.print(num0 + " " + num1 + " ");
            for (int i = 3; i <= num; i++) {
                num2 = num0 + num1;
                System.out.print(num2 + " ");
                num0 = num1;
                num1 = num2;
            }
            System.out.println();
        }




    }

