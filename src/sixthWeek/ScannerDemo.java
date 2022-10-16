package sixthWeek;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        System.out.println("Hello World");

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一行数字，以回车键结束");
        int i = scanner.nextInt();
        System.out.println("您好，您输入的数字为：" + i);
        while (true) {
            System.out.println("请输入一行字，以回车键结束, 输入exit退出");
            String s = scanner.nextLine();
            if (s.equals("exit")) {
                break;
            }
            System.out.println("您好，您输入的字为：" + s);
        }

        scanner.close();
    }
}
