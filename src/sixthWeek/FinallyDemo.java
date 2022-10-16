package sixthWeek;

public class FinallyDemo {

    public static void main(String[] args) {
        System.out.println(test(0));
        System.out.println(test(1));
    }

    static int test(int i) {

        System.out.println("程序开始了");
        try {
            i = 1 / i;
            System.out.println("try开始了");
            return i;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally { // 不管try会不会被catch到，finally里的代码都会被执行
            System.out.println("程序结束了");
        }

        return 0;
    }

}
