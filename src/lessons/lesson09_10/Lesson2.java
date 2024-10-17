package lessons.lesson09_10;

import java.util.Scanner;

public class Lesson2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Zahl : ");


        int x = sc.nextInt();

        while (x <= 100) {



            if ((x % 3) != 0) {


                System.out.println(x);
            }
            x++;
        }


    }


}



