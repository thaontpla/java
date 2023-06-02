package day02;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        int a, b, x;
        System.out.println("please enter a valid for \"a\": ");
        a = input.nextInt();
        System.out.println("please enter a valid for \"b\": ");
        b = input.nextInt();

        if (a==0) {
            System.out.println("Invalid a value. Please enter again.");
        }
        else {
            x = -b/a;
            System.out.println("The value x is: " + x);
        }
    }
}