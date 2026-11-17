package com.heima.ui;

import javax.swing.*;
import java.awt.*;

public class GameJFrame extends JFrame {
    public GameJFrame(){
        //初始化窗口
        initFrame();
        //初始化菜单
        initcaidan();
        //初始化图片
        initImage();



        //让窗口显示出来
        this.setVisible(true);
    }

    private void initImage() {
        //初始化图片
        //ImageIcon imageIcon = new ImageIcon("D:/DevWorkspace/100_JAVA/day16_code/image/girl/girl2/2.jpg");
        //创建一个JLabel的对象（管理容器）
        //JLabel jLabel = new JLabel(imageIcon);

        //指定图片位置
        //jLabel.setBounds(0, 0, 105, 105);

        //将图片添加到窗口中
        //this.getContentPane().add(jLabel);

        //循环加载图片
        int number = 1;
        for(int i=0;i<4;i++){
            for(int j =0;j<4;j++){
                ImageIcon imageIcon = new ImageIcon("D:/DevWorkspace/100_JAVA/day16_code/image/girl/girl2/"+number+".jpg");
                JLabel jLabel = new JLabel(imageIcon);
                jLabel.setBounds(105*j, 105*i, 105, 105);

                this.getContentPane().add(jLabel);
                number++;
            }

        }
        //将图片添加到窗口中
        //this.add(jLabel);
    }

    private void initcaidan() {
        //初始化菜单
        JMenuBar Jmenubar = new JMenuBar();

        //创建菜单上面的两个选项的对象（功能，关于我们）
        JMenu functionJMenu = new JMenu("功能");
        JMenu abooutJMenu = new JMenu("关于我们");

        //创建选项下面的条目对象
        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");

        JMenuItem accountItem = new JMenuItem("公众号");

        //将选项下面的条目对象添加到选项对象
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);
        abooutJMenu.add(accountItem);

        //将选项对象添加到菜单栏对象
        Jmenubar.add(functionJMenu);
        Jmenubar.add(abooutJMenu);

        //设置菜单栏
        this.setJMenuBar(Jmenubar);
    }

    private void initFrame() {
        //设置窗口的大小
        this.setSize(603, 680);
        //设置窗口的标题
        this.setTitle("拼图单机版V 1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认布局
        this.setLayout(null);
    }

}