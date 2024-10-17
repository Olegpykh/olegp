package lessons.homework17_10;



public class Homework1 {


    public static boolean isDeviceWorking(int temperature1, int temperature2) {
        return temperature1 > 100 && temperature2 < 100;
    }

    public static void main(String[] args) {
        int temperature1 = 110;
        int temperature2 = 90;

        boolean result = isDeviceWorking(temperature1, temperature2);
        System.out.println("Устройство работает: " + result);
    }






}


