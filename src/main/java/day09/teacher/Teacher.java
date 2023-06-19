package day09.teacher;

import java.util.Scanner;

public class Teacher extends Person{
    private static Teacher[] teachers = new Teacher[100];
    private static int AUTO_ID=100;
    int idTeacher;
    TeacherLevel level;

    public Teacher() {
        this.idTeacher=AUTO_ID;
        AUTO_ID++;
    }

    public int getIdTeacher() {
        return idTeacher;
    }

    public TeacherLevel getLevel() {
        return level;
    }

    public void setIdTeacher(int idTeacher) {
        this.idTeacher = idTeacher;
    }

    public void setLevel(TeacherLevel level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "idTeacher=" + idTeacher +
                ", level=" + level +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public void inforTeacher(){
        System.out.println("Bạn muốn thêm moi bao nhiêu giang vien");
        int teacherNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < teacherNumber; i++) {
            System.out.println("Nhap thong tin cho giang vien thu: " + (i + 1));
            super.inputInfor();
            System.out.print("Nhap trinh do: ");
            System.out.println("1. GS-TS");
            System.out.println("2. PGS-TS");
            System.out.println("3. Giang viên chính");
            System.out.println("4. Thạc sỹ");
            System.out.println("Chon: ");
            int levelChoice = new Scanner(System.in).nextInt();
            switch (levelChoice) {
                case 1:
                    this.setLevel(TeacherLevel.GS_TS);
                    break;
                case 2:
                    this.setLevel(TeacherLevel.PGS_TS);
                    break;
                case 3:
                    this.setLevel(TeacherLevel.GIANG_VIEN_CHINH);
                    break;
                case 4:
                    this.setLevel(TeacherLevel.THAC_SY);
                    break;
            }
        }
    }

}
