package middle.test.logic;

import java.util.Scanner;

public class Menu {
    ProductLogic product = new ProductLogic();
    StaffLogic staff = new StaffLogic();
    SaleListLogic saleList = new SaleListLogic();
    public void salelist() {
        while (true) {
            showMenu();
            int choice = functionChoice();
            switch (choice) {
                case 1:
                    product.add();
                    break;
                case 2:
                    product.show();
                    break;
                case 3:
                    staff.add();
                    break;
                case 4:
                    staff.show();
                    break;
                case 5:
                    saleList.showSaleList();
                    break;
                case 6:
                    staff.arrangeNameStaff();
                    break;
                case 7:
                    product.arrangeGroupProduct();
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
            System.out.println("************Phần mềm bán hàng***************");
            System.out.println("1. Thêm mới mặt hàng");
            System.out.println("2. In danh sách mặt hàng");
            System.out.println("3. Thêm mới nhân viên ");
            System.out.println("4. In danh sách nhân viên");
            System.out.println("5. In danh sách bán hàng trong ngày");
            System.out.println("6. Sắp xếp nhân viên");
            System.out.println("7. Sắp xếp nhóm hàng");
            System.out.println("Chọn: ");
    }


}
