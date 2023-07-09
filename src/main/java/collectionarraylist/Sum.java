package collectionarraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Tính tổng của các phần tử trong ArrayList
public class Sum {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        System.out.println("Ban muon tinh tong bao nhieu so?");
        int count = new Scanner(System.in).nextInt();
        int sum = 0;
        for (int i = 0; i < count; i++) {
            System.out.println("Số thứ " + (i+1));
            int number = new Scanner(System.in).nextInt();
            list.add(number);
            sum += number;
        }
        System.out.println(list);
        System.out.println(sum);
    }
}
