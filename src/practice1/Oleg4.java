package practice1;



public class Oleg4 {
    public static void main(String[] args) {

        int num = 10;
        int numTwo = -num;
        System.out.println(num);
        System.out.println(numTwo);
        System.out.println( (-1) * num);
        System.out.println((-num));

        num+=2;
        System.out.println(num++);

        System.out.println(num);

        int countTwo = 0;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                countTwo++;
            }
        }
        System.out.println("\n even count = " + countTwo);



    }
}
