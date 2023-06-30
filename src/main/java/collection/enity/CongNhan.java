package collection.enity;

public class CongNhan {
    //(mã công nhân, Họ tên, Địa chỉ, Số ĐT, Bậc thợ)
    // – trong đó Bậc thợ là một số nguyên từ 1 đến 7.
    // Mã công nhân là một số nguyên có 4 chữ số, tự động tăng.
    private static int AUTO_ID = 1000;
    int id;
    String name;
    String address;
    String phone;
    int rank;

    public CongNhan() {
        this.id = id;
        AUTO_ID++;
    }

}
