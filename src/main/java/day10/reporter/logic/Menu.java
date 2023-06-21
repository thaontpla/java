package day10.reporter.logic;

import day10.reporter.entity.TypePost;

import java.util.Scanner;

public class Menu {
    ReporterLogic reporter = new ReporterLogic();
    TypesPostLogic typesPost = new TypesPostLogic();
    SalaryLogic salary = new SalaryLogic();

    public void menuSalaryJournalist() {
        while (true) {
            showMenu();
            int choice = functionChoice();
            switch (choice) {
                case 1:
                    reporter.add();
                    break;
                case 2:
                    reporter.show();
                    break;
                case 3:
                    typesPost.add();
                    break;
                case 4:
                    typesPost.show();
                    break;
                case 5:
                    salary.calculate();
                    break;
            }
        }
    }

    private int functionChoice() {
        int choice;
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice >= 1 && choice <= 9) {
                break;
            }
            System.out.println("Nhập sai, mời nhập lại:");
        } while (true);
        return choice;
    }

    private void showMenu() {
        System.out.println("************Phần mềm quản lý giảng viên***************");
        System.out.println("1. Thêm mới phóng viên");
        System.out.println("2. In danh sách phóng viên");
        System.out.println("3. Thêm mới kiểu bài viết");
        System.out.println("4. In danh sách kiểu bài đã có ");
        System.out.println("5. Tính công cho phóng viên");
        System.out.println("6. Sắp xếp danh sách Bảng tính công: Theo Họ tên phóng viên");
        System.out.println("7. Sắp xếp danh sách Bảng tính công: Theo Số lượng bài viết (giảm dần)");
        System.out.println("8. Thu nhập của mỗi phóng viên");
        System.out.println("9. Thoát");
        System.out.println("Chọn: ");
    }
}
