package collection.advance;

import java.util.ArrayList;
import java.util.List;

public class TinhTong {
    private int tinhTong (int a, int b ){
        return a+b;
    }
    private float tinhTong (float a, float b ){
        return a+b;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aa");
    }
    private static void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //voi method
    private static <E, T> void printArray(E[] arr1, T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
