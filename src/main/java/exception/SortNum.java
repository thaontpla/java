package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SortNum {
    public class Main02 {

        public static void main(String[] args) {
            int[] a = inputArray();
            showArray(a);
            sort(a);
            showArray(a);
        }

        private static void showArray(int[] a) {
            System.out.println("------------------");
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
        }


        private static void sort(int[] a) {
            for (int i = 0; i < a.length - 1; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        private static int[] inputArray() {
            int n = inputNumber("Nhập số phần tử của mảng: ");
            while (true) {
                if (n >= 1) {
                    break;
                }
                System.out.println("Số phàn tử của mảng không thể âm, vui lòng nhập lại: ");
                n = inputNumber("Nhập số phần tử của mảng: ");
            }

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = inputNumber("a[" + i + "] = ");
            }
            return a;
        }

        private static int inputNumber(String message) {
            int x;
            while (true) {
                try {
                    System.out.print(message);
                    x = new Scanner(System.in).nextInt();
                    break;
                } catch (InputMismatchException ex) {
                    System.out.println("Sai định dạng, vui lòng nhập lại: ");
                }
            }
            return x;
        }

    }
}
