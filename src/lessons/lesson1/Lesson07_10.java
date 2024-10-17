package lessons.lesson1;

public class Lesson07_10 {

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


    //Логические операторы
    // OR(||), AND(&&) , NOT (!) (ИЛИ, И , НЕ)
    //                           ==,!=,<,>,<=,>=
    //Реляционные : (переменная1 оператор переменная2) = (true,false) - это выражение
    //                         OR, AND, NOT
    //Логические  : выражение1 оператор выражение2
    //(переменная1 оператор переменная2) логический оператор (переменная3 оператор переменная4))
 /*   int a = 10;
    int b = 20;
    boolean cond1 = a == b; // true, false
    boolean cond2 = a <= b; // true, false

        if (cond1 && cond2) {
        System.out.println("Hello");
    }

    //AND(&&) - результат работы всего выражения будет истина, если левое и правое выражение истины
    //OR(||) - результат работы всего выражения будет истина, если хотя бы одно выражение истина
    //NOT(!) - если выражение истина, то результат будет ложь и наоборот
    boolean resultCond = cond1 && cond2;
    boolean resultCondTwo = cond1 || cond2;
    boolean resultCondThree = !cond1;

        if ((a == b) && (a < b) || (a != b)) {

    } else {

    }*/

}
