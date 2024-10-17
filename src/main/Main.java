package main;

import task.Test;
import task.subtask.SubTest;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        SubTest subTest = new SubTest();

        System.out.println(test.num);
        System.out.println(subTest.str);



    }
}
