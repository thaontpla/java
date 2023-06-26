package middle.test.statics;

public enum GroupProduct {
    DIEN_TU("Điện tử"),
    DIEN_LANH("Điện lạnh"),
    MAY_TINH("Máy tính"),
    THIET_BI_VP("Thiết bị văn phòng");

    public String name;

    GroupProduct(String name) {
        this.name = name;
    }
}
