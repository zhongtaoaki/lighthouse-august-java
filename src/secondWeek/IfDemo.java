package secondWeek;

/**
 * if语句 分岐
 * 小括号内写判断条件 condition
 * 值为布尔数据类型的表达式(布尔的变量，比较运算符的结果，逻辑运算符)
 * 如果布尔值被判断为true，则执行大括号中的内容
 * 如果布尔值被判断为false，则执行else大括号中的内容
 */
public class IfDemo {
    public static void main(String[] args) {
        int a = 7;
        int b = 243422345;
        int c = b % 2;
        boolean flag = c == 1; // true : 奇数
        System.out.println(flag);

        if (c == 1) {
            System.out.println(b + "是一个奇数");
        } else {
            System.out.println(b + "是一个偶数");
        }

        System.out.println(c == 1 ? "是一个奇数" : "是一个偶数");

        System.out.println();

        if (c == 1) {
            System.out.println(b + "是一个奇数");
        }

        System.out.println(b + "是一个偶数");

        int number = 10;
        // 正数，负数，0
        if (number > 0) {
            System.out.println(number + "是一个正数");
        } else if (number < 0) {
            System.out.println(number + "是一个负数");
        } else {
            System.out.println(number + "是一个0");
        }

    }
}
