package secondWeek;

public class Practice1 {

    public static void main(String[] args) {

        int x = 20;
        int y = 10;

        int tmp;
        tmp = x;
        x = y;
        y = tmp;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int a = 7;
        int b = 2;
        double result = (double) a / b;
        System.out.println(a + " / " + b + " = " + result);
        System.out.println(a + " / " + b + " = " + (double) a / b);

        int c = b % 2;
        boolean flag = c == 1; //true : 奇数
        System.out.println(flag);
        System.out.println(a + "是一个奇数");
        System.out.println(b + "是一个偶数");
    }
}
