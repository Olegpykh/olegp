package practice1;

public class Oleg5 {

    public static void main(String[] args) {
        //Реляционные операторы
        //Логические операторы

        //Реляционные операторы(операторы сравнения) - возвращают boolean (true, false)
        // ==, !=, >, <, >=,<=
        int a = 10;
        int b = 15;
        boolean result = a == b;
        System.out.println("a == b is " + result);

        boolean result1 = a != b;
        System.out.println("a != b is " + result1);
        System.out.println("a > b is " + (a > b));
        System.out.println("a < b is " + (a < b));
        System.out.println("a >= b is " + (a >= b));
        System.out.println("a <= b is " + (a <= b));

        if (a < b) {
            System.out.println("is correct");
        }

        boolean isEquals = isEquals(10, 5);
        if(isEquals) {
            System.out.println("Is equals");
        }

        if(isEquals(20, 20)) {
            System.out.println("20 equals 20");
        }
        /*
        if(выражение) { если выражение истино, то выполняется код внутри if

        } else {

        }

         */
        boolean resultEquals = a == b; // true, false
        if(a == b) {

        }
        boolean resultTwo = isEquals(10, 10);  // true, false
        if(isEquals(10, 10)) {

        }
    }

    private static boolean isEquals(int a, int b) {
        //boolean result =  a == b;
        //return result;
        return a == b;
    }
}
