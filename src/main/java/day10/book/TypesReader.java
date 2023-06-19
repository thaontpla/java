package day10.book;

public enum TypesReader {
    SINH_VIEN("sinh viên"),
    HOC_VIEN("học viên cao học"),
    GIAO_VIEN("giáo viên");

    public String name;

    TypesReader(String name) {
        this.name = name;
    }
}
