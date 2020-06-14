package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Group4 extends Group implements MouseMotionListener {
    JTextField textField = new JTextField();
    CustomButton2 button = new CustomButton2("Click");
    JCheckBox checkBox1 = new JCheckBox("1");
    JCheckBox checkBox2 = new JCheckBox("2");
    JCheckBox checkBox3 = new JCheckBox("3");
    Container checkBoxes = new Container();

    public Group4(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        this.setLayout(new GridLayout(3,0,5,12));
        checkBoxes.setLayout(new FlowLayout());
        button.setPreferredSize(new Dimension(50,50));
        checkBoxes.add(checkBox1);
        checkBoxes.add(checkBox2);
        checkBoxes.add(checkBox3);
        this.addMouseMotionListener(this);
        button.addActionListener(new ButtonEventListener());
        this.add(textField);
        this.add(button);
        this.add(checkBoxes);
    }
    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        Shape buttonShape = button.getBounds();
        if(buttonShape.contains(mouseEvent.getPoint())) button.hover();
        else button.unhover();
    }
    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
    }

    class ButtonEventListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            String text = textField.getText();
            if(!(toggle(checkBox1,text) || toggle(checkBox2,text) || toggle(checkBox3,text)))
                JOptionPane.showMessageDialog(null, "Invalid", "Output", JOptionPane.PLAIN_MESSAGE);
        }
        private boolean toggle(JCheckBox checkBox, String text){
            if(text.equals(checkBox.getText())) {
                checkBox.setSelected(!checkBox.isSelected());
                return true;
            }
            else return false;
        }
    }
}
