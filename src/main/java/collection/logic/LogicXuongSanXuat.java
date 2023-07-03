package collection.logic;

import collection.enity.XuongSanXuat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LogicXuongSanXuat {
    List<XuongSanXuat> xuongSanXuats = new ArrayList<>();
    public void add() {
        System.out.println("Bạn muốn thêm mới bao nhiêu xưởng sản xuất?");
        int number = new Scanner(System.in).nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("Xưởng sản xuat thứ " + (i+1) + " mà bạn muốn thêm mới là:");
            XuongSanXuat xuongSanXuat = new XuongSanXuat();
            xuongSanXuat.inputInfo();
            xuongSanXuats.add(xuongSanXuat);
        }
    }

    public List<XuongSanXuat> getXuongSanXuats() {
        return xuongSanXuats;
    }

    public void setXuongSanXuats(List<XuongSanXuat> xuongSanXuats) {
        this.xuongSanXuats = xuongSanXuats;
    }

    public void show() {
        System.out.println(xuongSanXuats);
    }
}
