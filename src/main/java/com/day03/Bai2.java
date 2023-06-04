package com.day03;

import java.util.HashSet;
import java.util.Scanner;

//Viết chương trình Java để tìm ký tự xuất hiện nhiều nhất trong một chuỗi
//Chuỗi đã cho là: test string
//ký tự xuất hiện nhiều nhất trong chuỗi là: t
public class Bai2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String len;
        System.out.print("Please enter a the text: ");
        len = input.nextLine();
        System.out.println(characterMostVisible(len));
    }

    public static char characterMostVisible(String text) {
            char[] arr = text.toCharArray();
            String targetSt = "";
            int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return targetSt.charAt(max);
    }

}
