package lessons.lesson_15_10_24;

public class Lesson2 {
    public static void main(String[] args) {
        int n = 1239707821;
        int reverseN = reversNumber(n);
        System.out.println("Reverse of n = " + reverseN);

        if (n == reverseN)
            System.out.println("Palindrome = Yes");
        else
            System.out.println("Palindrome = No");
    }

    public static int reversNumber(int n)
    {
        int reversed_n = 0;
        while (n > 0) {
            reversed_n = reversed_n * 10 + n % 10;
            n = n / 10;
        }
        return reversed_n;
    }
}
