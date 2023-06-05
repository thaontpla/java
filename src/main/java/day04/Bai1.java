package day04;

import java.util.Arrays;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String number;
        System.out.print("Nhập phần tử: ");
        number = input.nextLine();
        char[] ch = number.toCharArray(); //chuyển đổi chuỗi thành kí tự trong mảng
        int[] numArray = new int[ch.length];
        for (int i = 0; i < ch.length; i++) {
            numArray[i] = Character.getNumericValue(ch[i]); //chuyển đổi ký tự thành số nguyên
            if (numArray[i] % 2 == 0) {
                numArray[i] += 1;
            }
        }
        System.out.print("Các phần tử là số chẵn trong mảng tăng lên 1: " + Arrays.toString(numArray));
    }
}
