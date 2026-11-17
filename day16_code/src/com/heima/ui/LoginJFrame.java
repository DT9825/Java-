package com.heima.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {
      public LoginJFrame() {

            this.setSize(488, 430);
            //设置窗口的标题
            this.setTitle("拼图登录界面");
            //设置界面置顶
            this.setAlwaysOnTop(true);
            //设置界面居中
            this.setLocationRelativeTo(null);
            //设置关闭模式
            this.setDefaultCloseOperation(3);

            this.setVisible(true);
      }
}