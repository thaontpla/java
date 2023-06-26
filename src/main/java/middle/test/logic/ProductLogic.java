package middle.test.logic;

import day10.reporter.entity.Reporter;
import middle.test.entity.Product;
import middle.test.entity.Staff;

import java.util.Scanner;

public class ProductLogic {
    Product[] products = new Product[100];
    public void add() {
        System.out.print("Bạn muốn thêm mới bao nhiêu : ");
        int numberReporter = new Scanner(System.in).nextInt();
        for (int i = 0; i < numberReporter; i++) {
            System.out.println("Nhập thông tin mặt hàng thứ " + (i+1));
            Product product = new Product();
            product.inputInfo();
            saveProduct(product);
        }
    }

    private void saveProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                break;
            }
        }
    }

    public void show() {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println(products[i].toString());
            }
        }
    }

    public void arrangeGroupProduct() {
        for (int i = 1; i < products.length; i++) {
            String key = products[i].getName();
            int j = i - 1;
            while (j >= 0 && products[i].getName().compareTo(key) > 0) {
                products[j + 1].setName(products[j].getName());
                j--;
            }
            products[j + 1].setName(key);
        }
        for (Product s : products) {
            System.out.println(s);
        }
    }
}
