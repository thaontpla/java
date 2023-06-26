package string;
//Bài 7. Nhập hai xâu S1 và S2. Tìm xâu S2 trong S1.
// Nếu có hãy loại bỏ S2 trong S1. Chú ý: phải loại bỏ cho đến khi không tìm được S2 trong S1 nữa.
public class Bai7 {
    public static void main(String[] args) {
        String s1 = "nguyen thi phuong thao";
        String s2 = "nguyen thi thao";
         if (s1.contains(s2)){
             s1 = s1.replace(s2, "");
        }
        System.out.println("loại bỏ S2 trong S1: " + s1);
    }
}
