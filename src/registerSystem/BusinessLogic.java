package registerSystem;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class BusinessLogic {

    private final static Map<String, User> users = new HashMap<>();

    public void login(String username, String password) {

        if (users.containsKey(username)) { // 如果用户名在用户表里
            if (users.get(username).getPassword().equals(password)) { // 如果密码也正确
                JOptionPane.showMessageDialog(null, " 登陆成功! 欢迎, " + username + ". ");
            } else {
                // 用户回答错误，登录失败。
                JOptionPane.showMessageDialog(null, "用户名/密码不正确");
            }
        } else { // 如果用户名不在用户表里
            JOptionPane.showMessageDialog(null, " 用户不存在: '" + username + "'. 登陆失败. ");
        }
    }

    public void register(String username, String password) {

        if (users.containsKey(username)) {
            // 如果用户名已存在，则重新输入
            JOptionPane.showMessageDialog(null, " 用户 '" + username + "' 已被注册. ");
        } else if (!Utils.isUsernameValid(username) || !Utils.isPasswordValid(password)) {
            // 如果用户名或密码格式不正确，则重新输入
            JOptionPane.showMessageDialog(null, " 你的输入不符合格式! ");
        } else {
            // 注册成功，输出用户列表
            users.put(username, new User(username, password));
            JOptionPane.showMessageDialog(null, " 注册成功! ");
        }
    }

}