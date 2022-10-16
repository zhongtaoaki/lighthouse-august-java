package sixthWeek;

import java.util.Optional;

public class StringDemo {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder(); // 线程不安全但是效率高

        String s = "Hello";
        s = s.replace("l", "L"); // String对象是不可变的
        System.out.println(s);

        sb.append("Hello");
        sb.replace(2, 4, "LL");
        System.out.println(sb);

        StringBuffer sb2 = new StringBuffer(); // 线程安全但是效率低

        Optional<StringBuilder> optional = Optional.of(sb);
        System.out.println(optional.get());
        System.out.println(optional.isPresent());
        optional.ifPresent(System.out::println);
    }
}
