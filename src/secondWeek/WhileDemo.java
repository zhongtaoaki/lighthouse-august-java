package secondWeek;

/**
 * 循环 ループ
 * Dont Repeat Yourself
 * DRY
 * while
 * while的小括号里写条件语句（布尔的变量，比较运算符的结果，逻辑运算符）
 * 迭代
 * 迭代器
 * 
 * 把20以内的所有偶数都输出出来
 */
public class WhileDemo {

    public static void main(String[] args) {

        int i = 0;
        // while (i < 5) {
        // System.out.println("Hello World");
        // i++;
        // }

        // do {
        // System.out.println("Hello World");
        // i++;
        // } while (i > 5);

        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
