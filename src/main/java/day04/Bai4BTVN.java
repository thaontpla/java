package day04;
//Bài 4:
//Viết chương trình Java để tính giá trị trung bình của các phần tử mảng.
//numbers = new int[]{20, 30, 25, 35, -16, 60, -100}
public class Bai4BTVN {
    public static void main(String[] args) {
        int[] numbers = {20, 30, 25, 35, -16, 60, -100};
        int sum = 0;
        for (int i = 0; i <numbers.length; i ++) {
            sum +=numbers[i];
        }
        double avg = sum/numbers.length;
        System.out.println(avg);
    }
}
