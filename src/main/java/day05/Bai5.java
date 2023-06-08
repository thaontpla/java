package day05;

import java.util.Scanner;

//Viết chương trình In ra Tam giác pascal như sau:
//1
//1 1
//1 2 1
//1 3 3 1
//1 4 6 4 1
public class Bai5 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner (System.in);
        System.out.print("Nhập so luong phan tu:");
        n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int index =1;
            for (int j = 0; j <= i; j++) {
                System.out.print(index + " ");
                index = index * (i - j) / (j + 1); // tăng giá trị của số đơn vị lên 1
            }
            System.out.println();
        }
    }
}
