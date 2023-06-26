package middle.test.entity;

import day10.reporter.statics.TypesReporter;
import middle.test.statics.GroupProduct;

import java.util.Scanner;

public class Product {
    private static int AUTO_ID = 1000;
    int id;
    String name;
    GroupProduct group;
    int price;
    int quality;
    public Product() {
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

    public GroupProduct getGroup() {
        return group;
    }

    public void setGroup(GroupProduct group) {
        this.group = group;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public Product(int id, String name, GroupProduct group, int price, int quality) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.price = price;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", price=" + price +
                ", quality=" + quality +
                '}';
    }
//Tên hàng, Nhóm hàng, Giá bán, Số lượng
    public void inputInfo() {
        System.out.print("Nhạp ten mặt hàng: ");
        this.setName(new Scanner(System.in).nextLine());
        System.out.print("Nhập nhóm: ");
        System.out.println("1. Điện tử");
        System.out.println("2. Điện lạnh ");
        System.out.println("3. Máy tính ");
        System.out.println("4. Thiết bị văn phòng");
        int choice;
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice >=1 && choice <=3) {
                break;
            }
            System.out.println("Nhap sai .");
        }while (true);
        switch (choice){
            case 1:
                setGroup(GroupProduct.DIEN_LANH);
                break;
            case 2:
                setGroup(GroupProduct.DIEN_TU);
                break;
            case 3:
                setGroup(GroupProduct.MAY_TINH);
                break;
            case 4:
                setGroup(GroupProduct.THIET_BI_VP);
                break;
        }
        System.out.print("Nhạp giá tiền mặt hàng: ");
        this.setPrice(new Scanner(System.in).nextInt());
        System.out.print("Nhạp số lượng mặt hàng: ");
        this.setQuality(new Scanner(System.in).nextInt());
    }
}
