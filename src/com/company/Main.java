package com.company;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    private static ArrayList mirrorNumbers = new ArrayList();

    public static void ListAdd() {
        Scanner input = new Scanner(System.in);
        boolean endLoop = false;


        while (!endLoop) {
            Integer scannerValue = input.nextInt();
            if ((scannerValue instanceof Integer) == false) {
                endLoop = true;
            }

            mirrorNumbers.add(scannerValue);


        }
    }

    public static void main(String[] args) {
        ListAdd();
        System.out.println(mirrorNumbers);
    }
}
