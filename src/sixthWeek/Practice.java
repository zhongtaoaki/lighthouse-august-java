package sixthWeek;

import java.util.HashMap;
import java.util.Map;

public class Practice {

    public static void main(String[] args) {

        char[] array = { 'f', 'a', 'c', 'b', 'c', 'd', 'a', 'e', 'e', 'd', 'c', 'b', 'd', 'c' };

        Map<Character, Integer> map = new HashMap<>();

        // for (char c : array) {
        //     if (map.containsKey(c)) {
        //         map.put(c, map.get(c)+1);
        //     } else {
        //         map.put(c, 1);
        //     }
        // }

        for (char c : array) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        System.out.println(map);
    }
}
