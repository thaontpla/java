package collectionarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(20);
//        int max = list.get(0);
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i)>max){
//                max= list.get(i);
//            }
//        }
        int max = Collections.max(list);
        System.out.println(max);
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println("sắp xếp tăng dần: " + list);
    }
}
