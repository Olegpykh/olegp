package lessons.lesson09_10;

import java.util.Scanner;

public class Lesson {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число : ");
        int day = sc.nextInt();

        String dayNane = getDayName(day);
        System.out.println(dayNane);


    }

    private static String getDayName(int day) {

        switch (day) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Errow";
        }

    }


}








