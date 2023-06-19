package day10.book;

public class Book {
//mã sách, Tên sách, Tác giả, Chuyên ngành, Năm xuất bản
private static int AUTO_ID = 10000;
    int id;
    String name;
    String tacGia;
    ChuyenNganh chuyenNganh;
    int numSX;

    public static int getAutoId() {
        return AUTO_ID;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTacGia() {
        return tacGia;
    }

    public ChuyenNganh getChuyenNganh() {
        return chuyenNganh;
    }

    public int getNumSX() {
        return numSX;
    }

    public static void setAutoId(int autoId) {
        AUTO_ID = autoId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public void setChuyenNganh(ChuyenNganh chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public void setNumSX(int numSX) {
        this.numSX = numSX;
    }
}
