package day10.reporter.logic;

import java.util.Scanner;

public class SalaryLogic {

    String[] types = {"A","B","C"};
    int[] prices = {1000,2000,3000};

    public void calculate() {
        System.out.println("Bạn đã viết bao nhiêu kiểu bài?");
        int numberType = new Scanner(System.in).nextInt();
        System.out.println("Đó là kiểu bài gì và số lượng bao nhiêu?");
        int salary = 0;
        for (int i = 0; i < numberType; i++) {
            System.out.println("Kiểu bài thứ " + i+  " :");
            System.out.println("Tên kiểu: ");
            String nameType = new Scanner(System.in).nextLine();
            System.out.println("Số lượng: ");
            int numberPost = new Scanner(System.in).nextInt();
            int index = 0;
            for (int j = 0; j <types.length ; j++) {
                if (types[j] == nameType) {
                    index = types[j].indexOf(types[j]);
                }
            }
            int price = prices[index];
            salary = numberPost * price;
            salary += salary;
        }
        System.out.println("Tiền lương là: " + salary);
    }
}
