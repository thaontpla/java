package middle.test.logic;

import middle.test.entity.Product;
import middle.test.entity.Staff;

import java.util.Scanner;

public class StaffLogic {
    Staff[] staffs = new Staff[100];

    public void add() {
        System.out.print("Bạn muốn thêm mới bao nhiêu : ");
        int numberReporter = new Scanner(System.in).nextInt();
        for (int i = 0; i < numberReporter; i++) {
            System.out.println("Nhập thông tin nhân vien thứ " + (i + 1));
            Staff staff = new Staff();
            staff.inputInfo();
            saveStaff(staff);
        }
    }

    private void saveStaff(Staff staff) {
        for (int i = 0; i < staffs.length; i++) {
            if (staffs[i] == null) {
                staffs[i] = staff;
                break;
            }
        }
    }

    public void show() {
        for (int i = 0; i < staffs.length; i++) {
            if (staffs[i] != null) {
                System.out.println(staffs[i].toString());
            }
        }
    }
    public void arrangeNameStaff() {
        for (int i = 1; i < staffs.length; i++) {
            String key = staffs[i].getName();
            int j = i - 1;
            while (j >= 0 && staffs[i].getName().compareTo(key) > 0) {
                staffs[j + 1].setName(staffs[j].getName());
                j--;
            }
            staffs[j + 1].setName(key);
        }
        for (Staff s : staffs) {
            System.out.println(s);
        }
    }
}
  
