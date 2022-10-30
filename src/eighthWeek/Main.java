package eighthWeek;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import eighthWeek.Grade.Subject;

public class Main {

    public static void main(String[] args) {

        List<Grade> grades = new ArrayList<>();
        grades.add(new Grade(15, Subject.JAVA, 81));
        grades.add(new Grade(18, Subject.JAVA, 65));
        grades.add(new Grade(25, Subject.PYTHON, 53));
        grades.add(new Grade(27, Subject.AWS, 90));
        grades.add(new Grade(30, Subject.JAVA, 40));
        grades.add(new Grade(73, Subject.AWS, 73));

        Map<Integer, String> map = new HashMap<>();
        map.put(15, "佐藤");
        map.put(18, "鈴木");
        map.put(25, "田中");
        map.put(27, "小島");
        map.put(30, "小林");

        // Java考试中，把所有考试结果按照分数由高到低输出，输出的时候包含考生姓名
        grades.stream()
                .filter(e -> e.getSubject() == Subject.JAVA)
                .sorted((e1, e2) -> e2.getScore() - e1.getScore())
                .forEach(e -> System.out.println(map.get(e.getNumber()) + ": " + e.getScore()));

        System.out.println("----------------");

        // 把所有没及格的同学输出一下
        grades.stream()
                .filter(e -> e.getScore() < 60)
                .forEach(e -> System.out.println(map.get(e.getNumber()) + ": " + e.getSubject() + ": " + e.getScore()));

    }

}
