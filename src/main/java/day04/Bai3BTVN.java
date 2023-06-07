package day04;

import java.util.ArrayList;
import java.util.Arrays;

//Bài 3:
//Chèn thêm vào (không phải là thay thế) 1 phần tử có value = 5 vào vị trí trí thứ 3 của mảng sau
//my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49}
public class Bai3BTVN {
    public static void main(String[] args) {
        int[] myArray = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        //sử dụng arraylist để chứa các phần tử
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0 ; i<myArray.length;i++) {
            list.add(myArray[i]);
        }
        //chèn
        int newValue = 5;
        int index = 3;
        list.add(index,newValue);
        //chuyển đôỉ thành mảng
        int[] newArr = new int[list.size()];
        for (int i=0 ; i<list.size();i++) {
            newArr[i]=list.get(i);
        }
        System.out.println("Mảng sau khi chèn thm là: " + Arrays.toString(newArr));
    }
}
