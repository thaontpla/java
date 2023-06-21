package day10.reporter.entity;

import java.util.Scanner;

public class TypePost {
    private static int AUTO_ID = 100;
    int id;
    String name;
    int price;

    public TypePost() {
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void inputInfo() {
        System.out.println("Tên bài viết: ");
        setName(new Scanner(System.in).nextLine());
        System.out.println("Đơn giá bài viết: ");
        setPrice(new Scanner(System.in).nextInt());
    }

    @Override
    public String toString() {
        return "TypePost{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}