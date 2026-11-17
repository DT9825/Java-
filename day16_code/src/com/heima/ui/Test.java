package com.heima.ui;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        //1、创建一个游戏的主界面窗口
        //上下左右移动的逻辑，统计步数的；一键通关，查看最终效果，恶搞好基友
        JFrame gameFrame = new JFrame();
        gameFrame.setSize(603, 680);
        gameFrame.setVisible(true);

        //2、创建一个登录界面
        //获取用户输入的用户名和密码，生成一个验证码，获取用户输入的验证码，判断是否正确，正确则登录成功，否则则登录失败
        JFrame loginFrame = new JFrame();
        loginFrame.setSize(488, 430);
        loginFrame.setVisible(true);

        //3、创建一个注册界面
        //获取用户输入的用户名和密码（两次），比较两次密码是否一致，判断当前用户是否已注册
        JFrame registerFrame = new JFrame();
        registerFrame.setSize(488, 500);
        registerFrame.setVisible(true);

    }
}
