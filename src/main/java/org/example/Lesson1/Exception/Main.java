package org.example.Lesson1.Exception;

import java.util.Arrays;

public class Main {
    /*
    1. Runtime
    2. IOException
    3. Error
     */

    public static void main(String[] args) {
//        int[] arrayInt = {1, 2, 3};
//
//        System.out.println(arrayInt[5]);
//        System.out.println(1 / 0);

//        System.out.print();

//        int[] arrayInt = new int[Integer.MAX_VALUE - 8];
        if (1 == 1) {
            System.out.println(1);
        } else if (2 == 2) {
            System.out.println(2);
        }

//        try {
//            System.out.println(1 / 0);
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//            System.out.println("Делить на 0 нельзя!");
//        } catch (Exception e) {
//
//        }

        String message = "";

        if (message.length() == 0) {
            try {
                throw new RuntimeException();
            } catch (Throwable e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
