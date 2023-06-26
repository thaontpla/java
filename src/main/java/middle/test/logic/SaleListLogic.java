package middle.test.logic;

import middle.test.entity.Product;

import java.util.Scanner;

public class SaleListLogic {
    String staff;
    String[] products;
    String date;
    String dateSearch;
    int numberDate;
    int numberProduct;

    public void showSaleList() {
        System.out.println("Bạn là ai? ");
        staff = new Scanner(System.in).nextLine();
        System.out.println("Bạn muon them danh sach ban hàng bao nhiêu ngày?");
        numberDate= new Scanner(System.in).nextInt();
        for (int i = 0; i < numberDate; i++) {
            System.out.println("Ngày thứ" + (i+1) + "là ngày? ");
            date = new Scanner(System.in).nextLine();
            System.out.println("Bạn bán được bao nhiêu mặt hàng? ");
            numberProduct= new Scanner(System.in).nextInt();
            for (int j = 0; j < numberProduct; j++) {
                System.out.println("Đó là mặt hàng gì? ");
                products[i]= new Scanner(System.in).nextLine();
            }
        }
        System.out.println("Bạn muốn xem danh sách bán hàng ngày nào? ");
        dateSearch = new Scanner(System.in).nextLine();
        for (int i = 0; i < numberProduct; i++) {
            if (date.equals(dateSearch)) {
                System.out.println(products[i].toString());
            }
        }

    }

}
