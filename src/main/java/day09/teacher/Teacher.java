package day09.teacher;

public class Teacher extends Person{
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
}
