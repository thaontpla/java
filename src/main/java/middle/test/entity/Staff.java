package middle.test.entity;

import day10.reporter.statics.TypesReporter;

import java.util.Scanner;

public class Staff extends Person{
    private static int AUTO_ID = 1000;
    int id;
    String dateSign;
    public Staff() {
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

    public String getDateSign() {
        return dateSign;
    }

    public void setDateSign(String dateSign) {
        this.dateSign = dateSign;
    }

    public Staff(int id, String dateSign) {
        this.id = id;
        this.dateSign = dateSign;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", dateSign='" + dateSign + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public void inputInfo() {
        super.inputInfor();
        System.out.print("Ngay ki hop dong: ");
        this.setName(new Scanner(System.in).nextLine());
    }
}
