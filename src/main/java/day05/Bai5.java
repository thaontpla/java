package day05;

import java.util.Scanner;

//Viết chương trình In ra Tam giác pascal như sau:
//1
//1 1
//1 2 1
//1 3 3 1
//1 4 6 4 1
public class Bai5 {
    public static void main(String[] args) {
//        int n;
//        Scanner input = new Scanner (System.in);
//        System.out.print("Nhập so luong phan tu:");
//        n = input.nextInt();
//        for (int i = 0; i < n; i++) {
//            int index =1;
//            for (int j = 0; j <= i; j++) {
//                System.out.print(index + " ");
//                index = index * (i - j) / (j + 1); // tăng giá trị của số đơn vị lên 1
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= 6; i++) {
//
//            for (int k = 6; k >= i; k--) {
//                System.out.print(" ");
//            }
//
//            for (int j = 1; j <= i; j++) {
//                if ( j == 1 || j == 2*i-1 ) {
//                    System.out.print("1");
//                }
//                else {
//                    if ( j == 1 || j == 2*i-1 ) {
//                        System.out.print("1");
//                    }
//                    int sum = 1 + (2*i-1);
//                    System.out.print(sum);
//                }
//            }
//            System.out.println();
//        }

        int n = 5;
        int i,j,g,k = 1;
        for ( i =0; i < n; i++) {
            //k=1;
            for (j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }
            //k++;
            for (g = 0; g <= i; g++){
                System.out.print(k+" ");
                  k = k * (i - g )/ (g + 1);
            }
            //k++;
            System.out.println();
        }
    }
}
