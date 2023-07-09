package file;

import java.io.Serializable;

public class Student implements Serializable {
    int id;
    private String name;
    private String clazz;

    public Student(int id, String name, String clazz) {
        this.id = id;
        this.name = name;
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + clazz + "\n";
//        return "Student{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", clazz='" + clazz + '\'' +
//                '}';
    }
}
