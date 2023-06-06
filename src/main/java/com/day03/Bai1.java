package com.day03;

//Viết chương trình thực hiện in ra các số từ 1 đến 100.
// Trong đó, những số nào chia hết cho 3 thì in chữ Fizz,
// những số nào chia hết cho 5 thì in chữ Buzz,
// những số nào chia hết cho cả 3 và 5 thì in chữ FizzBuzz
public class Bai1 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else
                System.out.println(i);
        }
    }
}
