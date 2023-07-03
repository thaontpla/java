package collection.enity;

public class TimeSheet {
    TimeSheetDetail timeSheetDetail;
    CongNhan congNhan;


    public TimeSheetDetail getTimeSheetDetail() {
        return timeSheetDetail;
    }

    public void setTimeSheetDetail(TimeSheetDetail timeSheetDetail) {
        this.timeSheetDetail = timeSheetDetail;
    }

    public CongNhan getCongNhan() {
        return congNhan;
    }

    public void setCongNhan(CongNhan congNhan) {
        this.congNhan = congNhan;
    }

    public TimeSheet(TimeSheetDetail timeSheetDetail, CongNhan congNhan) {
        this.timeSheetDetail = timeSheetDetail;
        this.congNhan = congNhan;
    }
}
