package day05;

import java.util.Scanner;

//Viết chương trình In ra tam giác Floyd’s như sau:
//1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15
public class Bai4 {
    public static void main(String[] args) {
        int n;
        int index =1;
        Scanner input = new Scanner (System.in);
        System.out.print("Nhập so luong phan tu:");
        n = input.nextInt();
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(index + " ");
                index++; // tăng giá trị của số đơn vị lên 1
            }
            System.out.println();
        }
    }
}
