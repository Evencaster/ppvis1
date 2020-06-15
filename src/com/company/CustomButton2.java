package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class CustomButton2 extends JButton {
    Color color = Color.blue;

    @Override
    protected void processMouseMotionEvent(MouseEvent e) {
        super.processMouseMotionEvent(e);
        hover();
    }


    public CustomButton2(String label) {
        super(label);
        Dimension size = new Dimension();
        setPreferredSize(size);
        setContentAreaFilled(false);
    }
    public void hover(){
        color = Color.yellow;
        repaint();
    }
    public void unhover(){
        color = Color.blue;
        repaint();
    }
    protected void paintComponent(Graphics g) {
        g.setColor(color);
        g.fillOval((getSize().width - 1) / 2 - (getSize().height - 1) / 4,0, (getSize().height - 1) / 2, (getSize().height - 1) / 2);
        g.fillOval((getSize().width - 1) / 2 - (getSize().height - 1) / 4,(getSize().height - 1) / 2, (getSize().height - 1) / 2, (getSize().height - 1) / 2);
        super.paintComponent(g);
    }
    protected void paintBorder(Graphics g){
        g.setColor(new Color(200,200,200));
        g.drawRect(0, 0, getWidth(), getHeight());
    }
}