package practise3;

public class Roman2 {

    public static void main(String[] args) {

     /*   Создайте две переменные * isWeekend * и * isRain *.
        Создайте переменную *canWalk *, значение которой должно быть истинным, если это выходной день(isWeekend = true)
        и не идет дождь (isRain = false).
                Создайте метод, который принимает два параметра и возвращает значение true / false
        Результат сохраните в canWalk
        Распечатайте в консоль.
*/
        boolean isWeekend = false;
        boolean isRain = false;
        boolean canWalk = methodCanWalk(isWeekend, isRain);

        if (canWalk) {
            System.out.println("Гуляйте на улице сегодня");

        } else {
            System.out.println("Дома сидите.Холодно");
        }

    }

    private static boolean methodCanWalk(boolean isWeekend1, boolean isRain1) {
        if (isWeekend1 && (isRain1 == false)) {

            return true;
        } else {
            return false;
        }
    }
}
