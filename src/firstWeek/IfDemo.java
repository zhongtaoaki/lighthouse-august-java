package firstWeek;

/**
 * 逻辑运算符
 * 且 and
 * & |
 * 
 * 
 */
public class IfDemo {

    public static void main(String[] args) {

        boolean b1 = true; // 我是一个男生吗？
        boolean b2 = false; // 我是日本人吗？

        System.out.println(!b1);

        System.out.println(b1 || b2);

        int[] array = { 1, 2, 3 };
        System.out.println(array.length >= 4 && array[3] < 5);

        int i = 10;

        System.out.println(i > 9 || i++ > 10);
        System.out.println(i);

        int j = 10;
        System.out.println( j++ > 10 || j > 10 );

    }
}
