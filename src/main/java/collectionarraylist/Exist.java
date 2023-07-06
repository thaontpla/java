package collectionarraylist;

import java.util.ArrayList;
import java.util.List;

public class Exist {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(20);
        int index=60;
        //list.remove(10);
        if (list.contains(index)){
            System.out.println("tồn tại trong ds");
        }
        else {
            System.out.println("khong tồn tại trong ds");
        }
    }
}
