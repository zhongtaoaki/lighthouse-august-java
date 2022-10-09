package fifthWeek;

import java.util.ArrayList;
import java.util.List;

/**
 * List
 * ArrayList是实装了List这个接口的实体类，new的时候使用多态
 * List里面所有的元素只能是同一种数据类型，声明的时候可以指定
 * List的长度是可以改变的
 * */
public class ListDemo {
    
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>(); // 多态
        list.add("suzuki");
        list.add("satou");
        list.add("suzuki");
        System.out.println(list.size());
        
        list.set(2, "tanaka");

        // System.out.println(list.get(0));
        // System.out.println(list.get(1));

        list.remove(0);
        System.out.println(list.get(0));

        list.remove("suzuki");
        System.out.println(list.get(0)); // IndexOutOfBoundsException

        System.out.println(list.size());
    }

}
