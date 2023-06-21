package day10.reporter.entity;

import day10.reporter.statics.TypesReporter;

import java.util.Scanner;

public class Reporter extends Person {
    private static int AUTO_ID = 10000;
    int id;
    TypesReporter types;
    public Reporter() {
        this.id = AUTO_ID;
        AUTO_ID++;
    }

    public static int getAutoId() {
        return AUTO_ID;
    }

    public int getId() {
        return id;
    }

    public TypesReporter getTypes() {
        return types;
    }

    public static void setAutoId(int autoId) {
        AUTO_ID = autoId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTypes(TypesReporter types) {
        this.types = types;
    }

    @Override
    public String toString() {
        return "Reporter{" +
                "id=" + id +
                ", types=" + types +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public void inputInfo() {
        super.inputInfor();
        System.out.print("Chon lọai phóng viên: ");
        System.out.println("1. chuyên nghiệp");
        System.out.println("2. nghiệp dư");
        System.out.println("3. cộng tác viên");
        System.out.println("Chon: ");
        int choice;
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice >=1 && choice <=3) {
                break;
            }
            System.out.println("Nhap sai loai phong vien.");
        }while (true);
        switch (choice){
            case 1:
                setTypes(TypesReporter.CHUYEN_NGHIEP);
                break;
            case 2:
                setTypes(TypesReporter.NGHIEP_DU);
                break;
            case 3:
                setTypes(TypesReporter.CONG_TAC_VIEN);
                break;
        }

    }

}
