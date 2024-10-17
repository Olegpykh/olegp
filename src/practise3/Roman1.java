package practise3;

import java.util.Scanner;

public class Roman1 {




        public static void main(String[] args) {
            //Логические операторы
            // OR(||), AND(&&) , NOT (!) (ИЛИ, И , НЕ)

            // && , || - операторы краткой схемы
            // & , |   - операторы полной схемы

            //boolean resultOne = methodOne();
            //boolean resultTwo = methodTwo();
            // false AND true = false
            // false AND false = false
            // AND - true , когда все участники выражения true
            // OR (||) - true , когда хотя бы одно выражение возвращает true

            if(methodOne() & methodTwo()) {  //&& - AND, &- AND, true && true
                System.out.println("Hello from if");
            }

        }

        private static boolean methodOne() {
            System.out.println("Hello from method one!");
            return false;
        }

        private static boolean methodTwo() {
            System.out.println("Hello from method two!");
            return true;
        }

      }

















