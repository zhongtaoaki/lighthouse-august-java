package sixthWeek;

public class ExceptionDemo {

    public static void main(String[] args) {

        int[] array = { 0, 1, 2 };

        System.out.println("程序开始");
        System.out.println("这是数组的三号位");

        System.out.println(1/0);

        try {
            System.out.println(array[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("这是数组的1号位");
        System.out.println(array[1]);

        System.out.println("这是数组的2号位");
        System.out.println(array[2]);

        System.out.println("程序正常结束");

    }
}
