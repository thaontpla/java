package day05;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;

//Bài 4: Nhập số liệu cho dãy số nguyên a[0], a[1],..., a[n-1].
// Tìm số lớn thứ hai và vị trí của nó trong dãy.
// Chú ý trường hợp cả dãy bằng nhau thì sẽ không có số lớn thứ 2.
public class BTVN04 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 4};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Số lớn nhất " + max);
        //Xóa phần tử lớn nất trong mảng,sử dụng arraylist để chứa các phần tử
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        list.removeAll(Collections.singletonList(max));
        //mảng mới loại bỏ giá trị max
        int[] newArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            newArr[i] = list.get(i);
        }
        int maxSecond = newArr[0];
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i]>maxSecond) {
                maxSecond = newArr[i];
            }
        }
        System.out.println("Số lớn thứ hai " + maxSecond);
        //tìm vị trí xất hiện
        for (int i = 0; i <newArr.length ; i++) {
            if (newArr[i]==maxSecond) {
                System.out.println("Vị trí " + i);
            }
        }

    }
}
