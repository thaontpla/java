package com.day03;

import java.util.Scanner;

public class ConvertTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int soGiay;
        int a, b, c;
        System.out.print("Số giờ là: ");
        a = input.nextInt();
        System.out.print("Số phút là: ");
        b = input.nextInt();
        System.out.print("Số giây là: ");
        c = input.nextInt();
        //Tính tổng số giây
        soGiay = a * 3600 + b * 60 + c;
        //Tính tổng số ngày và năm
        int soNgay = soGiay / (24 * 3600);
        int soNam = soNgay / 365;

        System.out.println(soGiay + " giay bang " + soNgay + " ngay va " + soNam + " nam.");
    }
}
