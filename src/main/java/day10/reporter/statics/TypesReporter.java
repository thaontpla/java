package day10.reporter.statics;

public enum TypesReporter {
    CHUYEN_NGHIEP("chuyên nghiệp"),
    NGHIEP_DU("nghiệp dư"),
    CONG_TAC_VIEN("cộng tác viên");

    public String name;

    TypesReporter(String name) {
        this.name = name;
    }
}
