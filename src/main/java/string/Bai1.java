package string;

//Bài 1. Sử dụng xâu ký tự để viết hàm kiểm tra số thuận nghịch.
// Áp dụng liệt kê các số thuận nghịch có 6 chữ số.
public class Bai1 {
    public static void main(String[] args) {
        for (int i = 100000; i < 999999; i++) {
            String str = String.valueOf(i);
            if (isReversible(str)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isReversible(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt((str.length() - 1) - i)) {
                return false;
            }
        }
        return true;
    }

}
