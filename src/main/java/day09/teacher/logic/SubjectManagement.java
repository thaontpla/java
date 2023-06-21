package day09.teacher.logic;

import day09.teacher.enity.Subject;

public class SubjectManagement {
    Subject subject = new Subject();
    private static Subject[] subjects = new Subject[100];
    public void add() {
        subject.inputInfor();
        saveSubject(subject);
    }

    public void show() {
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i] != null) {
                System.out.println(subjects[i]);
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
}
