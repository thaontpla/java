package day05;

//Bài 6: Nhập mảng a gồm N phần tử bao gồm các số nguyên dương.
// Kiểm tra xem a có phải là mảng đối xứng hay không (ví dụ: [15 2 1 2 15] là mảng đối xứng).
public class BTVN06 {
    public static void main(String[] args) {
        int[] arr = {15, 2, 1, 2, 15};
        if (isMangDoiXung(arr)) {
            System.out.println("Mang doi xung");
        }
        else {
            System.out.println("Khong mang doi xung");
        }
    }

    static boolean isMangDoiXung(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[arr.length-i-1]) {
                return false;
            }
        }
        return true;
    }
}
