package day09;

import java.time.LocalDate;

public abstract class Teacher {
    private String id;
    private String name;
    private LocalDate date;

    private String level;
    public void teach(){
    }
    public void study(){
    }
    public void eat(){
    }
    public abstract void sleep();
}
