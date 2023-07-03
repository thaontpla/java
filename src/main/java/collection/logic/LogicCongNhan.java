package collection.logic;

import collection.enity.CongNhan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LogicCongNhan {
    List<CongNhan> congnhans = new ArrayList<>();

    public List<CongNhan> getCongnhans() {
        return congnhans;
    }

    public void setCongnhans(List<CongNhan> congnhans) {
        this.congnhans = congnhans;
    }

    public void add() {
        System.out.println("Bạn muốn thêm mới bao nhiêu công nhân?");
        int number = new Scanner(System.in).nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("Công nhân thứ " + (i+1) + "mà bạn muốn thêm mới là:");
            CongNhan congNhan = new CongNhan();
            congNhan.inputInfor();
            congnhans.add(congNhan);
        }
    }


    public void show() {
        System.out.println(congnhans);
    }

    public boolean isEmpty() {
        return congnhans.isEmpty();
    }
}
