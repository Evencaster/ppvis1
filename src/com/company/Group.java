package com.company;

import javax.swing.*;
import java.awt.*;

public class Group extends JPanel {
    protected void paintComponent(Graphics g){
        g.setColor(new Color(200,200,200));
        g.fillRect(0, 0, getWidth(), getHeight());
    }
}
