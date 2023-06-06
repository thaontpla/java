package day04;

import java.util.Scanner;

//Bài 1:
//Viết chương trình Java để tính
// giá trị trung bình của một mảng các số nguyên trừ giá trị lớn nhất và nhỏ nhất
public class Bai1BTVN {
    public static void main(String[] args) {
        // khoi tạo mảng
        int quantity;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        quantity = input.nextInt();

        int[] arr = new int[quantity];
        for (int i = 0; i < quantity; i++) {
            System.out.printf("\na[%d]=", i);
            arr[i] = input.nextInt();
        }
        //tìm gia tri max
        int max = arr[0];
        for (int i = 1; i < quantity; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        //tìm giá trị min
        int min = arr[0];
        for (int i = 1; i < quantity; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        //tìm giá trị trung bình
        int sum = 0;
        for (int i=0;i<quantity;i++) {
            sum += arr[i];
        }
        double avg = sum/quantity;
        //tính toán công thuc
        double calculation = avg - (max + min);

        System.out.println("Giá trị trung bình của một mảng các số nguyên trừ giá trị lớn nhất và nhỏ nhất la: " + calculation);
    }
}
