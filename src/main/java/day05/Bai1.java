package day05;

import java.util.Scanner;

//Bài 1:
//Viết chương trình in ra màn hình tam giác vuông có hình dạng sau đây:
//1
//12
//123
//1234
//12345
public class Bai1 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập so lượng phần tử: ");
        n = input.nextInt();
        for (int i = 1; i < n; i++) { // vòng lặp theo số hàng
            for (int j = 1; j <=i; j++) { // vòng lặp theo số cột
                System.out.print(j);
            }
            System.out.println(); // xuống dòng khi in xong mỗi hàng
        }
        
    }
}
