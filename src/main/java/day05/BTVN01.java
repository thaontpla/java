package day05;
//Bài 1: Viết chương trình liệt kê các số nguyên có 7 đến 9 chữ số thoả mãn:
//a) Là số thuận nghịch.
//b) Chỉ có chữ số 0, 6, 8
//c) Tổng chữ số chia hết cho 10
public class BTVN01 {
    public static void main(String[] args) {
        int sum;
        for (int i = 10000000; i <= 999999999; i++) {
            if (isThuanNghich(i)) {
                String str = Integer.toString(i);
                if (str.matches("[068]+")) {
                    int number = Integer.parseInt(str);
                    if (tongCacPhanTu(number) % 10 == 0) {
                        System.out.println(Integer.parseInt(str));
                    }
                }
            }
        }

    }
    static boolean isThuanNghich(int n) {
        String str = Integer.toString(n);
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

    static int tongCacPhanTu (int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }
}
