package com.day03;

import java.util.HashSet;
import java.util.Scanner;

//Viết chương trình Java để tìm ký tự xuất hiện nhiều nhất trong một chuỗi
//Chuỗi đã cho là: test string
//ký tự xuất hiện nhiều nhất trong chuỗi là: t
public class Bai2 {

    public static void main(String[] args) {
        String str1 = "test string";
        int N = 256;
        int ctr[] = new int[N];
        int l = str1.length();
        for (int i = 0; i < l; i++)
            ctr[str1.charAt(i)]++;
        int max = -1;
        char result = ' ';

        for (int i = 0; i < l; i++) {
            if (max < ctr[str1.charAt(i)]) {
                max = ctr[str1.charAt(i)];
                result = str1.charAt(i);
            }
        }
        System.out.println("The given string is: " + str1);
        System.out.println("Max occurring character in the given string is: " + result);
    }

}