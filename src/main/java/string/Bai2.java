package string;

import java.util.Scanner;

//Bài 2. Viết chương trình nhập vào một xâu ký tự s bất kỳ,
// sau đó chuyển sang dạng xen kẽ chữ in hoa và chữ in thường.
// Ví dụ s = ABCDefgh thì kết quả là AbCdEfGh
public class Bai2 {
    public static void main(String[] args) {
        System.out.print("Nhập chuỗi kí tự: ");
        String s = new Scanner(System.in).nextLine();
        //String s = "ABCDefgh";
        for (int i = 0; i < s.length()-1; i++) {
            String str = String.valueOf(s.charAt(i));
            String newStr;
            if (i%2==0) {
                newStr= str.toUpperCase();
            }
            else {
                newStr= str.toLowerCase();
            }
            System.out.print(newStr);
        }
    }
}
