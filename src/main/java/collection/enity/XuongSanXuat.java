package collection.enity;

import java.util.Scanner;

//Khai báo lớp Xưởng sản xuất (mã xưởng, tên xưởng, mô tả, Hệ số công việc),
// mã xưởng là một số nguyên có 3 chữ số, tự động tăng. Hệ số công việc
// là một số thực từ trong khoảng từ 1 đến 20,
// cho biết mức đánh giá chung về các công việc trong xưởng đó đảm nhiệm.
public class XuongSanXuat {
    private static int AUTO_ID = 100;
    int id;
    String name;
    String description;
    int factor;

    public XuongSanXuat() {
        this.id=AUTO_ID;
        AUTO_ID++;
    }

    @Override
    public String toString() {
        return "XuongSanXuat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", factor=" + factor +
                '}';
    }

    public XuongSanXuat(int id, String name, String description, int factor) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.factor = factor;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFactor() {
        return factor;
    }

    public void setFactor(int factor) {
        this.factor = factor;
    }

    public void inputInfo() {
        System.out.print("Nhạp ten xưởng: ");
        this.setName(new Scanner(System.in).nextLine());
        System.out.print("Nhập mô tả: ");
        this.setDescription(new Scanner(System.in).nextLine());
        System.out.print("Nhạp hesooso cong viec : ");
        this.setFactor(new Scanner(System.in).nextInt());
    }


}
