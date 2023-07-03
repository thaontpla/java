package collection.enity;

public class TimeSheetDetail {
    XuongSanXuat xuongSanXuat;
    int numberDay;

    public TimeSheetDetail(XuongSanXuat xuongSanXuat, int numberDay) {
        this.xuongSanXuat = xuongSanXuat;
        this.numberDay = numberDay;
    }

    public XuongSanXuat getXuongSanXuat() {
        return xuongSanXuat;
    }

    public void setXuongSanXuat(XuongSanXuat xuongSanXuat) {
        this.xuongSanXuat = xuongSanXuat;
    }

    public int getNumberDay() {
        return numberDay;
    }

    public void setNumberDay(int numberDay) {
        this.numberDay = numberDay;
    }
}
