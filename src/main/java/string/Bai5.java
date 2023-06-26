package string;

import java.util.Scanner;

//Bài 5. Viết chương trình thực hiện nhập một xâu họ tên theo cấu trúc:
// họ…đệm…tên; chuyển xâu đó sang biểu diễn theo cấu trúc tên…họ…đệm.
public class Bai5 {
    public static void main(String[] args) {
        System.out.println("Nhập họ: ");
        String firstName = new Scanner(System.in).nextLine();
        System.out.println("Nhập tên đệm: ");
        String surname = new Scanner(System.in).nextLine();
        System.out.println("Nhập tên: ");
        String lastName = new Scanner(System.in).nextLine();

        System.out.println(lastName + firstName +  surname);
    }
}
