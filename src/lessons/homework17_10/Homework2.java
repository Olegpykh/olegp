package lessons.homework17_10;

import java.util.Scanner;

public class Homework2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму на счету (N): ");
        int N = scanner.nextInt();
        int days = 0;

        while (N > 0) {
            days++;
            int maxDivisor = findMaxDivisor(N);
            N -= maxDivisor;
        }

        int temperature1 = 110;
        int temperature2 = 90;

        boolean result = isDeviceWorking(temperature1, temperature2);
        System.out.println("Устройство работает: " + result);

        System.out.println("Количество дней, необходимых для снятия всех денег: " + days);
    }


    private static int findMaxDivisor(int num) {
        for (int i = num / 2; i >= 1; i--) {
            if (num % i == 0) {
                return i;
            }
        }
        return 1;




    }












    public static boolean isDeviceWorking(int temperature1, int temperature2) {
        return temperature1 > 100 && temperature2 < 100;
    }




}
