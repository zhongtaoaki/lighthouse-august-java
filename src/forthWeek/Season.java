package forthWeek;

import java.util.Random;

/**
 * 
 * 季节
 * 有且只有四个对象
 * 这四个对象的，名字，属性都是固定 final
 * 不能出现第五个对象
 * 这4个对象永远不能消失
 * 
 * 枚举
 * 
 */
public enum Season {

    SPRING("春天"), SUMMER("夏天"), AUTUMN("秋天"), WINTER("冬天");

    private String name;

    // 常量
    // public final static Season SPRING = new Season("春天");
    // public final static Season SUMMER = new Season("夏天");
    // public final static Season AUTUMN = new Season("秋天");
    // public final static Season WINTER = new Season("冬天");

    // 构造器
    Season(String name) {
        this.name = name;
    }

    // getter 获取器
    public String getName() {
        return this.name;
    }

}

class Test {

    public static void main(String[] args) {

        Season spring = Season.SPRING;
        System.out.println(spring.getName());

        Season[] seasons = {Season.SPRING, Season.SUMMER, Season.WINTER};

        Random random = new Random();
        int result = random.nextInt(3);// 0,1,2

    }


}
