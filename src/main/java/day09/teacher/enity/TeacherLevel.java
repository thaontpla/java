package day09.teacher.enity;

public enum TeacherLevel {
    GS_TS("GS-TS"),
    PGS_TS("PGS-TS"),
    GIANG_VIEN_CHINH("Giang viên chính"),
    THAC_SY("Thạc sỹ");

    public String name;

    TeacherLevel(String name) {
        this.name = name;
    }
}
