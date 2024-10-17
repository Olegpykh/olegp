package lessons.lessonn10_10;

import java.util.Scanner;

public class Lesson10_10_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Die Zahl ist : ");
        int num1 = sc.nextInt();
        Hello(num1);

    }


    public static void Hello(int num1) {
        for (int i = 2; i <= num1; i += 2) {

            System.out.println(i);

        }


    }}

