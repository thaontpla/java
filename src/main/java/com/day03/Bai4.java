package com.day03;

import java.util.Scanner;

//Viết chương trình nhập hai số nguyên n, m
// và in ra hình chữ nhật rỗng các dấu * kích thước n*m. Ví dụ với n=5, m=4:
public class Bai4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, m;
        System.out.print("Nhập n: ");
        n = input.nextInt();
        System.out.print("Nhập m: ");
        m = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
