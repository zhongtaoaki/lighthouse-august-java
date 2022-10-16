package sixthWeek;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Register {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("aki", "123");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("请输入用户名和密码，按回车键结束");
            String username = scanner.nextLine();
            String password = scanner.nextLine();

            if (map.containsKey(username)) {
                System.out.println("该用户名已存在，请更换用户名");
            } else if (!checkUsername(username) || !checkPassword(password)) {
                System.out.println("您的用户名和密码不符合要求：用户名的格式是字母加数字。密码的格式是字母加数字，不低于8位，不超过16位");
            } else {
                map.put(username, password);
                System.out.println("恭喜你注册成功，欢迎：" + username);
                break;
            }
        }
        scanner.close();
    }

    private static boolean checkUsername(String username) {
        boolean flag = Pattern.matches("[a-zA-Z0-9]+", username);
        System.out.println(flag);
        return flag;
    }

    private static boolean checkPassword(String password) {
        boolean flag = Pattern.matches("[a-zA-Z0-9]{8,16}", password);
        System.out.println(flag);
        return flag;
    }
}
