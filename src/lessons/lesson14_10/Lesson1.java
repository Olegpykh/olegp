package lessons.lesson14_10;

public class Lesson1 {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i += 2) {
            System.out.println(i);
        }

       /* int j = 0;
        while (j < 10) {
            System.out.println("Current step (while) - " + (j + 1));
            j += 2;
        }*/

        int i = 0;
        do {
            System.out.println("Я в теле DO " + i);
            i--;
        }

        while (i > -3);


        int count = 10;
        getCount(count);
    }


    public static void getCount(int count) {

        while (count > 0) {
            System.out.println("Привет программист : " + count);
            count--;

        }

    }


}
/*

          Инициализируйте переменную int count = 10;
          Создать метод, который печатает в консоле “Привет программист 1” count раз 
          Используйте цикл while*/


