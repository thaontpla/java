package com.thao;

public class day02 {
    public static void main(String[] args) {
        // Lay mot so nguyen ngau nhien trong khoang 0 den 1000
        int number = (int) (Math.random() * 1001);
        System.out.println("So nguyen ngau nhien trong khoang tu 0 den 1000 la: " + number);
        // Tinh Tong
        int sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        System.out.println(sum);
    }
}
