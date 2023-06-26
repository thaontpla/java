package exception;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        thuonghaiso();
    }

    private static void thuonghaiso() {
        int a = nhapso("Nhap a: ");
        int b = nhapso("Nhap b: ");
        try {
            do {
                System.out.println("a/b là: " + a/b);
                break;
            }while (true);
        }catch (Exception e){
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
            }while (true);
        }catch (Exception e){
            //xử lý khi có ngoại lệ xẩy ra
            System.out.println("Nhập không đúng định dạng");
        }
        return x;
    }
}
