package day09.teacher;

import java.util.Scanner;

public class Subject implements InputInfor {
    private static int AUTO_ID=100;
    private int id;
    private String name;
    private int totalLesson;
    private int theory;
    private double payment;

    public static void setAutoId(int autoId) {
        AUTO_ID = autoId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotalLesson(int totalLesson) {
        this.totalLesson = totalLesson;
    }

    public void setTheory(int theory) {
        this.theory = theory;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public static int getAutoId() {
        return AUTO_ID;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTotalLesson() {
        return totalLesson;
    }

    public int getTheory() {
        return theory;
    }

    public double getPayment() {
        return payment;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", totalLesson=" + totalLesson +
                ", theory=" + theory +
                ", payment=" + payment +
                '}';
    }

    @Override
    public void inputInfor() {
        System.out.println("Nhap ma mon hoc: ");
        this.setId(new Scanner(System.in).nextInt());
        System.out.println("Nhap ten mon hoc: ");
        this.setName(new Scanner(System.in).nextLine());
        System.out.println("Nhap tong so tiet: ");
        this.setTotalLesson(new Scanner(System.in).nextInt());
        System.out.println("Nhap so tiet ly thuyet: ");
        this.setTheory(new Scanner(System.in).nextInt());
        System.out.println("Nhap muc kinh phi: ");
        this.setPayment(new Scanner(System.in).nextDouble());

    }
}
