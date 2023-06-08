package day05;

import java.util.Scanner;

//Bài 2:
//Viết chương trình cũng là in ra tam giác vuông nhưng các số trên 1 hàng đc lặp lại:
//1
//22
//333
//4444
//55555
public class Bai2 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập so lượng phần tử: ");
        n = input.nextInt();
        for (int i = 1; i < n; i++) { // vòng lặp theo số hàng
            for (int j = 1; j <=i; j++) { // vòng lặp theo số cột
                System.out.print(i);
            }
            System.out.println(); // xuống dòng khi in xong mỗi hàng
        }
    }
}
