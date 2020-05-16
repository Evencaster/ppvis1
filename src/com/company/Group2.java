package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Group2 extends Group implements MouseMotionListener {
    JTextField textField = new JTextField();
    CustomButton2 button1 = new CustomButton2("Click");
    CustomButton2 button2 = new CustomButton2("Swap");
    public Group2(){
        JFrame.setDefaultLookAndFeelDecorated(true);

        this.setLayout(new GridLayout(3,0,5,12));
        button1.setPreferredSize(new Dimension(50,50));
        button2.setPreferredSize(new Dimension(50,50));
        this.addMouseMotionListener(this);
        button1.addActionListener(new ButtonEventListener("click"));
        button2.addActionListener(new ButtonEventListener("swap"));
        this.add(textField);
        this.add(button1);
        this.add(button2);
        this.setVisible(true);
    }
    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        Shape button1Shape = button1.getBounds();
        if(button1Shape.contains(mouseEvent.getPoint())) button1.hover();
        else button1.unhover();
        Shape button2Shape = button2.getBounds();
        if(button2Shape.contains(mouseEvent.getPoint())) button2.hover();
        else button2.unhover();
    }
    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
    }
    class ButtonEventListener implements ActionListener {
        String option;
        ButtonEventListener(String opt){
            option = opt;
        }
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if(option.equals("click")){
                button2.setText(textField.getText());
            }
            else if(option.equals("swap")){
                String buf;
                buf = button1.getText();
                button1.setText(button2.getText());
                button2.setText(buf);
            }
        }
    }
}
