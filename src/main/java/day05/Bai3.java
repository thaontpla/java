package day05;

import java.util.Scanner;

//Viết chương trình cũng là in ra tam giác vuông
// nhưng các số đơn vị của từng phần tử tăng dần lên 1 giống như sau:
//1
//2 3
//4 5 6
//7 8 9 10
public class Bai3 {
    public static void main(String[] args) {
        int n;
        int value =1;
        Scanner input = new Scanner (System.in);
        System.out.print("Nhập so luong phan tu:");
        n = input.nextInt();
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(value + " ");
                value++; // tăng giá trị của số đơn vị lên 1
            }
            System.out.println();
        }
    }
}
