package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Group1 extends Group implements MouseMotionListener {
    JTextField textField = new JTextField();
    CustomButton2 button = new CustomButton2("Click");
    JComboBox<String> comboBox = new JComboBox<>();
    public Group1(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        this.setLayout(new GridLayout(0,3,5,12));
        button.setPreferredSize(new Dimension(50,50));
        button.addActionListener(new ButtonEventListener());
        this.addMouseMotionListener(this);
        this.add(textField);
        this.add(button);
        this.add(comboBox);
        this.setVisible(true);
    }
    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        Shape buttonShape = button.getBounds();
        if(buttonShape.contains(mouseEvent.getPoint())) {
            button.hover();
        } else button.unhover();
    }
    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
    }
    class ButtonEventListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            for(int i = 0; i < comboBox.getItemCount(); i++) {
                if(textField.getText().equals(comboBox.getItemAt(i))) {
                    JOptionPane.showMessageDialog(null, "Already exist", "Error", JOptionPane.PLAIN_MESSAGE);
                    return;
                }
            }
            comboBox.addItem(textField.getText());
        }
    }
}
