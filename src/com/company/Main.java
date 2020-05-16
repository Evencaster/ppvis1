package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame window = new JFrame();
        JFrame.setDefaultLookAndFeelDecorated(true);

        Group1 group1 = new Group1();
        Group2 group2 = new Group2();
        Group3 group3 = new Group3();
        Group4 group4 = new Group4();
        Group5 group5 = new Group5();

        group1.setPreferredSize(new Dimension(300,100));
        group2.setPreferredSize(new Dimension(300,100));
        group3.setPreferredSize(new Dimension(300,100));
        group4.setPreferredSize(new Dimension(300,100));
        group5.setPreferredSize(new Dimension(300,350));

        window.setLayout(new FlowLayout(FlowLayout.LEFT));
        window.add(group1);
        window.add(group2);
        window.add(group3);
        window.add(group4);
        window.add(group5);

        window.setPreferredSize(new Dimension(1300, 700));
        window.pack();
        window.setVisible(true);
        window.setLocationRelativeTo(null);
    }
}