package day09.teacher.logic;

import day09.teacher.enity.Subject;
import day09.teacher.enity.Teacher;

import java.util.Scanner;

public class Menu {
    private static TeacherManagement teachers = new TeacherManagement();
    private static SubjectManagement subjects = new SubjectManagement();

    public static void menuTeacher() {

        while (true) {
            showMenuContain();
            int choice = functionChoice();
            switch (choice) {
                case 1:
                    teachers.add();
                    break;
                case 2:
                    teachers.show();
                    break;
                case 3:
                    subjects.add();
                    break;
                case 4:
                    subjects.show();
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
            }


        }
    }

    private static int functionChoice() {
        int choice;
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice >= 1 && choice <= 9) {
                break;
            }
            System.out.println("Chon sai");
        } while (true);
        return choice;
    }


    private static void showMenuContain() {
        System.out.println("************Phần mềm quản lý giảng viên***************");
        System.out.println("1. Thêm mới gianng viêm");
        System.out.println("2. In danh sách giảng viên");
        System.out.println("3. Thêm mới mon hoc");
        System.out.println("4. In danh sách môn học ");
        System.out.println("5. Lập bảng kê khi giảng dậy");
        System.out.println("6. In bảng kê khai giảng dậy");
        System.out.println("7. Sắp xếp bảng kê khia giảng dậy");
        System.out.println("8. Tính lương giảng viên");
        System.out.println("9. Thoát");
        System.out.println("Chọn: ");
    }

}
