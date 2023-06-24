package string;

//Bài 3. Viết chương trình thực hiện chuẩn hoá một xâu ký tự nhập từ bàn phím
// (loại bỏ các dấu cách thừa, chuyển ký tự đầu mỗi từ thành chữ hoa, các ký tự khác thành chữ thường)
public class Bai3 {
    public static void main(String[] args) {
        String s = "  nguyen    thi   phuong thao  ";
        String strTem = s.trim().replaceAll("\\s+", " ");
        System.out.println(strTem);
        String newStr="";
        String[] words = strTem.split(" ");
        for (String word: words) {
            String first = word.substring(0,1).toUpperCase();
            String remain = word.substring(1).toLowerCase();
            newStr +=first+remain+" ";
        }
        System.out.println(newStr);
    }
}
