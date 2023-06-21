package day09.teacher.logic;

import day09.teacher.enity.Teacher;

public class TeacherManagement {
    private static Teacher[] teachers = new Teacher[100];
    Teacher teacher = new Teacher();
    public void add() {
        teacher.infoTeacher();
        saveTeacher(teacher);
    }
    private static void saveTeacher(Teacher teacher) {
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] == null) {
                teachers[i] = teacher;
                break;
            }
        }
    }

    public void show() {
            for (int i = 0; i < teachers.length; i++) {
                if (teachers[i] != null) {
                    System.out.println(teachers[i]);
                }
            }
    }
}
