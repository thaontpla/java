package day09;

import java.time.LocalDate;

public class Student {
    private String id; //nên để biến là private, chỉ lớp cha là public để con có thể nhìn thấy
    private String name;
    private LocalDate date;

    public void study(){
    }
    public void eat(){
    }
    public void sleep(){
    }
}
