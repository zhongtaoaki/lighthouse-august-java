package fifthWeek;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        System.out.println(map.size());

        map.put("China", "Beijing");
        map.put("Japan", "Tokyo");
        map.put("UK", "London");

        System.out.println(map.get("China"));

        System.out.println(map.keySet());

        // map.remove("UK");

        map.put("China", "BeiJing");
        System.out.println(map.get("China"));

        System.out.println(map.containsKey("China"));

        // 循环下标(推荐)
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        // 用foreach循环map本身
        for (Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println(map);
    }

}
