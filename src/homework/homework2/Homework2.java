package lessons.homework17_10;

import java.util.Random;

public class Homework3 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[8];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50) + 1;
        }

        System.out.print("Исходный массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();


        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }

        System.out.print("Измененный массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}



package lessons.homework17_10;

import java.util.Random;

public class Homework4 {


    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[5];


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(90) + 10; // [10, 99]
        }


        System.out.print("Массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();


        boolean isStrictlyIncreasing = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                isStrictlyIncreasing = false;
                break;
            }
        }


        if (isStrictlyIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }
    }
}

