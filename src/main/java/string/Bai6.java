package string;

import java.util.Arrays;
import java.util.Scanner;

//Bài 6. Nhập một câu không quá 20 từ, mỗi từ không quá 10 ký tự.
// Viết chương trình tách các từ trong câu và in các từ theo thứ tự Alphabet.
public class Bai6 {
    public static void main(String[] args) {
        System.out.println("Nhập một câu không quá 20 từ: ");
        String text = new Scanner(System.in).nextLine();
        String[] words = text.split("\\s+");
        do {
            if (text.length()>20){
                System.out.println("Đã nhập vượt quá 20 từ. Nhập lại.");
                break;
            }
            for (int i = 0; i < words.length; i++) {
                if (words[i].length() > 10) {
                    System.out.println("mỗi từ quá 10 ký tự. Nhập lại");
                }
            }
            break;
        }while (true);
        for (int i = 0; i < words.length; i++) {
            Arrays.sort(words);
            System.out.println(words[i]);
        }
    }
}
