package day09.main;

import day09.teacher.Subject;
import day09.teacher.Teacher;
import day09.teacher.TeacherLevel;

import java.util.Scanner;

public class App {
    private static Teacher[] teachers = new Teacher[100];
    private static Subject[] subjects = new Subject[100];

    public static void main(String[] args) {

        while (true) {
            menu();
            int choice;
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();
//            do {
//                if (choice < 1 || choice > 10) {
//                    System.out.println("Chon sai");
//                    break;
//                }
//            } while (true);
            if (choice < 1 || choice > 10) {
                System.out.println("Chon sai");
            }
            Teacher teacher = new Teacher();
            Subject subject = new Subject();
            switch (choice) {
                case 1:
                    teacher.inforTeacher();
                    saveTeacher(teacher);
                    break;
                case 2:
                    showTeacher();
                    break;
                case 3:
                    subject.inputInfor();
                    saveSubject(subject);
                    break;
                case 4:
                    showSubject();
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

    private static void showSubject() {
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i] != null) {
                System.out.println(subjects[i]);
            }
        }
    }
    private static void showTeacher() {
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] != null) {
                System.out.println(teachers[i]);
            }
        }
    }

    private static void saveSubject(Subject subject) {
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i] == null) {
                subjects[i] = subject;
                break;
            }
        }
    }

    private static void saveTeacher(Teacher teacher) {
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] == null) {
                teachers[i] = teacher;
                break;
            }
        }
    }

    private static void menu() {
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
