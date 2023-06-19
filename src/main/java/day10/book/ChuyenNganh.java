package day10.book;

public enum ChuyenNganh {
    KHTN("Khoa học tự nhiên"),
    VHNT("Văn học – Nghệ thuật"),
    CNTT("Công nghệ thông tin"),
    DTVT("Điện tử Viễn thông");

    public String name;

    ChuyenNganh(String name) {
        this.name = name;
    }
}
