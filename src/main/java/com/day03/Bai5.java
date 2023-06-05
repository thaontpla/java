package com.day03;

import java.util.Scanner;

//Viết một chương trình Java để đảo ngược một số nguyên dương nhập từ bàn phím
// bằng cách sử dụng vòng lặp while và do-while và break và continue.
// Chương trình sẽ yêu cầu người dùng nhập một số nguyên dương,
// sau đó đảo ngược và in ra số đã đảo ngược.
//Ví dụ: Nhập vào số 123456 --> Kết quả nhận được là số: 654321
public class Bai5 {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập dãy số nguyên dương: ");
        number = input.nextInt();
        //Đổi từ số nguyên thành chuỗi
        String numString = Integer.toString(number);
        StringBuilder sb = new StringBuilder(numString);
        //đảo ngược chuỗi
        sb.reverse();
        // Chuyển đổi StringBuilder thành chuỗi
        String reversedStr = sb.toString();
        // Chuyển đổi chuỗi thành số nguyên
        int reverseNum = Integer.parseInt(reversedStr);
        System.out.print("Số đảo ngược: " + reverseNum);

    }
}
