package fifthWeek;

import java.util.HashSet;
import java.util.Set;

/**
 * Set
 * set也是一个接口，使用HashSet来实例化
 * 所有元素没有顺序的
 * 所有的元素不可以重复
 */
public class SetDemo {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        System.out.println(set);

        set.remove(2);
        System.out.println(set);

        System.out.println(set.contains(1));
        System.out.println(set.contains(2));

        Set<Student> set2 = new HashSet<>();
        set2.add(new Student("satou"));
        set2.add(new Student("suzuki"));
        set2.add(new Student("tanaka"));

        boolean result = set2.contains(new Student("satou"));
        System.out.println(result);

    }
}

class Student {
    public String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        return s.name.equals(this.name);
    }
}
