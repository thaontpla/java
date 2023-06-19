package day10.book;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Book[] books = new Book[100];
        menuBooks();
        int choice;
        choice = new Scanner(System.in).nextInt();
        switch (choice){
            case 1: //ên sách, Tác giả, Chuyên ngành, Năm xuất bản
                Book book = new Book();
                System.out.print("Nhap ten sach: ");
                book.setName(new Scanner(System.in).nextLine());
                System.out.print("Nhap tac gia: ");
                book.setTacGia(new Scanner(System.in).nextLine());
                System.out.print("Chuyen nganh: ");


                for (int i = 0; i <books.length ; i++) {
                    if (books[i] == null){
                        books[i] = book;
                    }
                }
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;

        }
    }

    private static void menuBooks() {
        System.out.println("************Phần mềm quản lý sách***************");
        System.out.println("1. Nhập danh sách đầu sách mới");
        System.out.println("2. In ra danh sách các đầu sách đã có");
        System.out.println("3. Nhập danh sách bạn đọc mới.");
        System.out.println("4. In ra danh sách bạn đọc đã có. ");
        System.out.println("Chọn: ");
    }
}
