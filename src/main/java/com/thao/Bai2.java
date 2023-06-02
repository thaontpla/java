package com.thao;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, delta, x1, x2;
        System.out.println("please enter a valid for \"a\": ");
        a = input.nextDouble();
        System.out.println("please enter a valid for \"b\": ");
        b = input.nextDouble();
        System.out.println("please enter a valid for \"c\": ");
        c = input.nextDouble();
        delta = (b * b) - (4 * a * c);

        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("The equation has two distinct solutions:");
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);

    }

}
