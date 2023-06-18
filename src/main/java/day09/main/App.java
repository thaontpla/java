package day09.main;

import day09.teacher.Teacher;
import day09.teacher.TeacherLevel;

import java.util.Scanner;

public class App {
    private static Teacher[] teachers = new Teacher[100];

    public static void main(String[] args) {
        while (true) {
            System.out.println("************Phần mềm quản lý giảng viên***************");
            System.out.println("1. Thêm mới gianng viêm");
            System.out.println("2. In danh sách giảng viên");
            System.out.println("3. Thêm mới giảng viên");
            System.out.println("4. In danh sách môn học ");
            System.out.println("5. Lập bảng kê khia giảng dậy");
            System.out.println("6. In banảng kê khai giảng dậy");
            System.out.println("7. Sắp xếp banảng kê khia giảng dậy");
            System.out.println("8. Tính lương giảng viên");
            System.out.println("9. Thoát");
            System.out.println("Chọn: ");

            int choice;
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();
            do {
                if (choice < 1 || choice > 10) {
                    System.out.println("Chon sai");
                    break;
                }
            }
            while (true);
//            if (choice < 1 || choice>10) {
//                System.out.println("Chon sai");
//            }
                switch (choice) {
                    case 1:
                        System.out.println("Bạn muốn thêm moi bao nhiêu giang vien");
                        int teacherNumber = new Scanner(System.in).nextInt();
                        for (int i = 0; i < teacherNumber; i++) {
                            System.out.println("Nhap thong tin cho giang vien thu: " + (i + 1));
                            Teacher teacher = new Teacher();
                            System.out.print("Nhạp ten giang vien: ");
                            teacher.setName(new Scanner(System.in).nextLine());
                            System.out.print("Nhap dia chi: ");
                            teacher.setAddress(new Scanner(System.in).nextLine());
                            System.out.print("Nhạp so dien thoại: ");
                            teacher.setPhone(new Scanner(System.in).nextLine());
                            System.out.print("Nhap trinh do: ");
                            System.out.println("1. GS-TS");
                            System.out.println("2. PGS-TS");
                            System.out.println("3. Giang viên chính");
                            System.out.println("4. Thạc sỹ");
                            System.out.println("Chon: ");
                            int levelChoice = new Scanner(System.in).nextInt();
                            switch (levelChoice) {
                                case 1:
                                    teacher.setLevel(TeacherLevel.GS_TS);
                                    break;
                                case 2:
                                    teacher.setLevel(TeacherLevel.PGS_TS);
                                    break;
                                case 3:
                                    teacher.setLevel(TeacherLevel.GIANG_VIEN_CHINH);
                                    break;
                                case 4:
                                    teacher.setLevel(TeacherLevel.THAC_SY);
                                    break;
                            }
                            for (int j = 0; j < teachers.length; j++) {
                                if (teachers[i] == null) {
                                    teachers[i] = teacher;
                                    break;
                                }
                            }

                        }
                        break;
                    case 2:
                        for (int i = 0; i < teachers.length; i++) {
                            if (teachers[i] != null) {
                                System.out.println(teachers[i]);
                            }
                        }
                        break;
                    case 3:
                        break;
                    case 4:
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
}
