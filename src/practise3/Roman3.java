package practise3;

import java.util.Scanner;

public class Roman3 {


    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
       boolean x = false;
       while (!x){
           String word = console.nextLine();
           x = word.equalsIgnoreCase("exit");
       }

    }
}













