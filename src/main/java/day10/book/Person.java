package day10.book;

import day09.teacher.InputInfor;

import java.util.Scanner;

public class Person implements InputInfor {
    protected String name;
    protected String address;
    protected String phone;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public void inputInfor() {
        System.out.print("Nhạp ten: ");
        this.setName(new Scanner(System.in).nextLine());
        System.out.print("Nhap: ");
        this.setAddress(new Scanner(System.in).nextLine());
        System.out.print("Nhạp so dien thoại: ");
        this.setPhone(new Scanner(System.in).nextLine());
    }
}
