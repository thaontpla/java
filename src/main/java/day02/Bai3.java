package day02;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap chieu dai cua hinh chu nhat: ");
        double chieuDai = input.nextDouble();

        System.out.print("Nhap chieu rong cua hinh chu nhat: ");
        double chieuRong = input.nextDouble();

        double chuVi = 2 * (chieuDai + chieuRong);
        double dienTich = chieuDai * chieuRong;

        System.out.println("Chu vi cua hinh chu nhat la: " + chuVi);
        System.out.println("Dien tich cua hinh chu nhat la: " + dienTich);
    }
}
