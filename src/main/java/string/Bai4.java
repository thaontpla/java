package string;

//Bài 4. Viết chương trình thực hiện nhập một xâu ký tự và tìm từ dài nhất trong xâu đó.
// Từ đó xuất hiện ở vị trí nào?
// (Chú ý. nếu có nhiều từ có độ dài giống nhau thì chọn từ đầu tiên tìm thấy).
public class Bai4 {
    public static void main(String[] args) {
        String s = "thi phuong thao";
        String[] words = s.split("\\s+");
        int[] num = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            num[i] = words[i].length();
            System.out.println(num[i]);
        }
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }
        for (int i = 0; i < num.length; i++) {
            if (num[i] == max) {
                System.out.println("Từ dài nhất là: "+words[i]);
                System.out.println("Xuất hiện vị trí : " + (i+1));
                break;
            }
        }
    }

}
