package collection.enity;

import java.util.Scanner;

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
        this.id = AUTO_ID;
        AUTO_ID++;
    }

    public static int getAutoId() {
        return AUTO_ID;
    }

    public static void setAutoId(int autoId) {
        AUTO_ID = autoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public CongNhan(int id, String name, String address, String phone, int rank) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", rank=" + rank +
                '}';
    }


    public void inputInfor() {
        System.out.print("Nhạp ten: ");
        this.setName(new Scanner(System.in).nextLine());
        System.out.print("Nhap dia chi: ");
        this.setAddress(new Scanner(System.in).nextLine());
        System.out.print("Nhạp so dien thoại: ");
        this.setPhone(new Scanner(System.in).nextLine());
        System.out.print("Nhạp bậc thợ: ");
        this.setRank(new Scanner(System.in).nextInt());
    }
}
