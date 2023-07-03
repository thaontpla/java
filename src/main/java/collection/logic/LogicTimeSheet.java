package collection.logic;

import collection.enity.CongNhan;
import collection.enity.TimeSheet;
import collection.enity.TimeSheetDetail;
import collection.enity.XuongSanXuat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LogicTimeSheet {
    LogicCongNhan congNhan;
    LogicXuongSanXuat xuongSanXuat;

    public void show() {
//        if (congNhan.isEmpty() || xuongSanXuat.xuongSanXuats.isEmpty()) {
//            System.out.println("Không có dữ liệu về công nhân và xưởng.");
//        }
        System.out.println("Nhập ID công nhân muốn Lập bảng chấm công: ");
        int idCongNhan;
        CongNhan congNhan1 = null;
        idCongNhan = new Scanner(System.in).nextInt();
        do {
            for (int i = 0; i < congNhan.getCongnhans().size(); i++) {
                if (congNhan.getCongnhans().get(i).getId() == idCongNhan) {
                    congNhan1 = congNhan.getCongnhans().get(i);
                    break;
                }
            }
            if (congNhan1 != null) {
                break;
            }
            System.out.println("Không tồn tại công nhân. Nhập lai.");
        } while (true);
        System.out.println("Làm bao nhieu xuong?");
        List<TimeSheetDetail> timeSheetDetails = new ArrayList<>();
        int count = 0;
        int numberXuong = new Scanner(System.in).nextInt();
        TimeSheetDetail timeSheetDetail = null;
        for (int i = 0; i < numberXuong; i++) {
            System.out.println("Nhập ID xưởng thứ " + (i + 1) + " muốn Lập bảng chấm công: ");
            int idXuong;
            XuongSanXuat xuongSanXuat1 = null;
            do {
                idXuong = new Scanner(System.in).nextInt();
                for (int j = 0; j < xuongSanXuat.getXuongSanXuats().size(); j++) {
                    if (xuongSanXuat.getXuongSanXuats().get(i).getId() == idXuong) {
                        xuongSanXuat1 = xuongSanXuat.getXuongSanXuats().get(i);
                        break;
                    }
                }
                if (xuongSanXuat1 != null) {
                    break;
                }
                System.out.println("Không tồn tại xưởng. Nhập lai.");
            } while (true);
            System.out.println("Xuong này làm bao nhiêu ngày?");
            int numberDay;
            do {
                numberDay = new Scanner(System.in).nextInt();
                if (numberDay > 30) {
                    System.out.println("So ngay ko vuong qua 30");
                    continue;
                }
                break;
            } while (true);
            timeSheetDetail = new TimeSheetDetail(xuongSanXuat1, numberDay);
            timeSheetDetails.get(count);
            count++;
        }
        TimeSheet timeSheet = new TimeSheet(timeSheetDetail, congNhan1);
        System.out.println(timeSheet);
    }
}

