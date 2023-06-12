package day05;

import java.util.ArrayList;

//Bài 5: Nhập số liệu cho dãy số nguyên a[0], a[1],..., a[n-1] và 2 số nguyên b, c (b < c).
// Tính trung bình cộng các phần tử của dãy nằm trong đoạn [b, c].
public class BTNV05 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 4};
        int b = 4;
        int c = 8;
        int sum;
        double avg;
        ArrayList<Integer> list = new ArrayList<>(); // ArrayList chứa các phần tử
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > b && arr[i] < c) {
                list.add(arr[i]);
            }
        }
        int[] newArr = new int[list.size()]; // mảng mới từ ArrayList
        for (int i = 0; i < list.size(); i++) {
            newArr[i] = list.get(i);
        }
        //tính tổng
        sum = 0;
        for (int i = 0; i < newArr.length; i++) {
            sum += i;
        }
        avg=sum/newArr.length;
        System.out.println(avg);
    }

}
