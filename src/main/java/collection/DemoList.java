package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoList {
    public static void main(String[] args) {
        int[] arr = new int[100];
        arr[0] = 1;
        Student[] students = new Student[100];

        //tránh việc thêm vào list nhiều kiểu dữ liệu khác nhau
        List<Student> students1 = new ArrayList<>();
        Student a = new Student();
        students1.get(a.getName().indexOf(0));

        List list1 = new ArrayList();
        list1.add(1);
        list1.add('a');
        list1.add("aa");
        list1.add(new Student());
        System.out.println(list1);

        for (Object s : list1) {
            System.out.println(s);
        }

        Iterator iterator = list1.iterator();
        while (iterator.hasNext()){
            Object o = iterator.next();
            System.out.println(o);
        }


    }
}
