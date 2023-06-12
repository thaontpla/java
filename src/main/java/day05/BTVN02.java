package day05;
//Bài 2: Viết chương trình liệt kê các số nguyên có 7 chữ số thoả mãn:
//a) Là số nguyên tố.
//b) Tất cả các chữ số là nguyên tố
//c) Đảo của nó cũng là một số nguyên tố
public class BTVN02 {
    public static void main(String[] args) {
        for (int i = 1000000; i < 9999999; i++) {
            if (soNguyenTo(i)) {
                if (tatCaChuSoLaNguyenTo(i)) {
                    if (soNguyenTo(daoSo(i))) {
                        System.out.println(i);
                    }
                }
            }
        }
    }

    static boolean soNguyenTo(int number) {
        if (number <=1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) { //kiểm tr chạy từ i đến number nếu trong khoaảng đó có số chia hết thì ko là số nguyên tố
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean tatCaChuSoLaNguyenTo(int number) {
        while (number > 0) {
            int digit = number % 10; // chia 10 lấy phần dư
            if (!soNguyenTo(digit)) {
                return false;
            }
            number /= 10; // tạo ra số mới đã loại bổ số cuối cùng
        }
        return true;
    }

    static int daoSo (int number) {
        StringBuilder str = new StringBuilder();
        str.append(number); //sử dụng để thêm một chuỗi kí tự, một mảng kí tự hoặc một giá trị của kiểu dữ liệu nguyên thủy vào cuối của đối tượng StringBuilder.
        str.reverse();
        return Integer.parseInt(str.toString());
    }
}
