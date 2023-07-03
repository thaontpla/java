package collection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoMap {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("ba", "Banana");
        map1.put("ca", "Canana");
        map1.put("ra", "Ranana");
        System.out.println(map1);

        Map<Long, List<Student>> longa = new HashMap<>();
    }
}
