package secondWeek;

public class SwitchDemo {

    public static void main(String[] args) {

        int number = 3;

        if (number == 1) {
            System.out.println(number + "是1");
        } else if (number == 2) {
            System.out.println(number + "是2");
        } else if (number == 3) {
            System.out.println(number + "是3");
        } else if (number == 4) {
            System.out.println(number + "是4");
        } else {
            System.out.println(number + "是其他数字");
        }

        switch (number) { // 数据类型 整型，char，枚举类，字符串
            case 9, 10, 11:
                System.out.println("现在是秋季");
                break;
            case 12, 1, 2:
                System.out.println("现在是冬季");
                break;
            case 3, 4, 5:
                System.out.println("现在是夏季");
                break;
            case 6, 7, 8:
                System.out.println("现在是春季");
                break;
            default:
                System.out.println("请输入1-12的数字");
                break;
        }

        if (3 <= number && number <= 5) {
            System.out.println("现在是春季");
        } else if (6 <= number && number <= 8) {
            System.out.println("现在是夏季");
        } else if (9 <= number && number <= 11) {
            System.out.println("现在是秋季");
        } else if (number <= 3 && number == 12) {
            System.out.println("现在是冬季");
        } else {
            System.out.println("请输入1-12的数字");
        }

    }

}
