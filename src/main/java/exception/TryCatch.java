package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        //thuonghaiso();
        thuonghaisover2();
    }

    private static void thuonghaiso() { //nếu ko muốn nhập nhiều thì cho theem count.
        int a = nhapso("Nhap a: ");
        int b = nhapso("Nhap b: ");
        try {
            do {
                System.out.println("a/b là: " + a / b);
                break;
            } while (true);
        } catch (Exception e) {
            //xử lý khi có ngoại lệ xẩy ra
            System.out.println("Nhập không đúng định dạng lắm");
        }
    }

    private static int nhapso(String message) {
        int x = 0;
        try {
            do {
                System.out.println(message);
                x = new Scanner(System.in).nextInt();
                break;
            } while (true);
        } catch (Exception e) {
            //xử lý khi có ngoại lệ xẩy ra
            System.out.println("Nhập không đúng định dạng");
        }
        return x;
    }

    private static void thuonghaisover2() {
        try {
            System.out.println("Nhap a: ");
            int a = new Scanner(System.in).nextInt();
            System.out.println("Nhap b: ");
            int b = new Scanner(System.in).nextInt();
            System.out.println("a/b = " + a / b);

        } catch (InputMismatchException e) {
            //e.printStackTrace();
            //xử lý khi có ngoại lệ xẩy ra
            System.out.println("Nhập không đúng định dạng lắm");
        } catch (ArithmeticException e) {
            System.out.println("KO thể chia cho 0");
        }
    }
}
