package collection.logic;

import java.util.Scanner;

public class Menu {
    LogicCongNhan congNhan = new LogicCongNhan();
    LogicXuongSanXuat xuongSanXuat = new LogicXuongSanXuat();

    LogicTimeSheet list = new LogicTimeSheet();

    public void xuongSanXuat() {
        while (true){
            showMenu();
            int choice = functionChoice();
            switch (choice) {
                case 1:
                    congNhan.add();
                    break;
                case 2:
                    congNhan.show();
                    break;
                case 3:
                    xuongSanXuat.add();
                    break;
                case 4:
                    xuongSanXuat.show();
                    break;
                case 5:
                    list.show();
                    break;
            }
        }
    }

    private int functionChoice() {
        int choice;
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice<=1 || choice <9){
                break;
            }
            System.out.println("Nhập sai, mời nhập lại.");
        }while (true);
        return choice;
    }

    private void showMenu() {
        System.out.println("************Phần mềm quản lý xưởng sản xuất***************");
        System.out.println("1. Thêm mới công nhân");
        System.out.println("2. In danh sách công nhân");
        System.out.println("3. Thêm mới xưởng sản xuất");
        System.out.println("4. In danh sách xưởng sản xuất đã có ");
        System.out.println("5. Lập bảng chấm công ");
        System.out.println("6. Sắp xếp theo tên cong nhan ");
        System.out.println("Chọn: ");
    }
}
