package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class GroupConsistsOfElementsJTextFieldJButtonJRadioButtons extends Group implements MouseMotionListener {
    JTextField textField = new JTextField();
    CustomButton2 button = new CustomButton2("Click");
    JRadioButton radioButton1 = new JRadioButton("Radio 1");
    JRadioButton radioButton2 = new JRadioButton("Radio 2");
    JRadioButton radioButton3 = new JRadioButton("Radio 3");
    Container radioButtons = new Container();

    public GroupConsistsOfElementsJTextFieldJButtonJRadioButtons(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        this.setLayout(new GridLayout(3,0,5,12));
        button.setPreferredSize(new Dimension(50,50));
        radioButtons.setLayout(new FlowLayout());
        radioButtons.add(radioButton1);
        radioButtons.add(radioButton2);
        radioButtons.add(radioButton3);
        this.addMouseMotionListener(this);
        button.addActionListener(new ButtonEventListener());
        this.add(textField);
        this.add(button);
        this.add(radioButtons);
        this.setVisible(true);
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
            radioButton1.setSelected(false);
            radioButton2.setSelected(false);
            radioButton3.setSelected(false);
            if(textField.getText().equals(radioButton1.getText())) radioButton1.setSelected(true);
            else if(textField.getText().equals(radioButton2.getText())) radioButton2.setSelected(true);
            else if(textField.getText().equals(radioButton3.getText())) radioButton3.setSelected(true);
            else JOptionPane.showMessageDialog(null, "Invalid", "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }

}
