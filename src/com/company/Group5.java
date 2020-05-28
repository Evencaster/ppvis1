package com.company;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

class TheGroupConsistsOfElementsJtextfieldJbutton1Jbutton2Jbutton3JtableTheJtableElementContainsTwoColumnsTheUserInsertsTheTextIntoTheJtextfieldThenClicksTheJbutton1ElementAfterWhichTheTextFromTheJtextfieldIsEnteredInTheFirstColumnOfTheJtableElementThenItClicksTheJbutton2ElementAfterWhichTheSelectedTextFromTheFirstJtableColumnIsTransferredToTheSecondColumnOfTheJtableElementInTheSameRowThenItClicksTheJbutton3ElementAfterWhichTheSelectedTextFromTheSecondJtableColumnIsTransferredToTheFirstColumnOfTheJtableElementInTheSameRowInAJtableControlInEachRowOneColumnAlwaysRemainsEmptyIfTheCellSelectedForTransferContainsAnEmptyValueThenWhenYouClickOnTheCorrespondingJbutton2OrJbutton3ElementNothingShouldHappen extends JPanel implements MouseMotionListener {
    JTextField textField = new JTextField();
    JTable table = new JTable(1,2);
    CustomButton2 button1 = new CustomButton2("Button 1");
    CustomButton2 button2 = new CustomButton2("Button 2");
    CustomButton2 button3 = new CustomButton2("Button 3");
    Container buttons = new Container();

    boolean start = true;

    public TheGroupConsistsOfElementsJtextfieldJbutton1Jbutton2Jbutton3JtableTheJtableElementContainsTwoColumnsTheUserInsertsTheTextIntoTheJtextfieldThenClicksTheJbutton1ElementAfterWhichTheTextFromTheJtextfieldIsEnteredInTheFirstColumnOfTheJtableElementThenItClicksTheJbutton2ElementAfterWhichTheSelectedTextFromTheFirstJtableColumnIsTransferredToTheSecondColumnOfTheJtableElementInTheSameRowThenItClicksTheJbutton3ElementAfterWhichTheSelectedTextFromTheSecondJtableColumnIsTransferredToTheFirstColumnOfTheJtableElementInTheSameRowInAJtableControlInEachRowOneColumnAlwaysRemainsEmptyIfTheCellSelectedForTransferContainsAnEmptyValueThenWhenYouClickOnTheCorrespondingJbutton2OrJbutton3ElementNothingShouldHappen() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        this.setLayout(new GridLayout(5,0,5,12));
        buttons.setLayout(new FlowLayout());
        button1.setPreferredSize(new Dimension(50,50));
        button2.setPreferredSize(new Dimension(50,50));
        button3.setPreferredSize(new Dimension(50,50));
        this.addMouseMotionListener(this);
        button1.addActionListener(new ButtonEventListener(1));
        button2.addActionListener(new ButtonEventListener(2));
        button3.addActionListener(new ButtonEventListener(3));
        buttons.add(button1);
        buttons.add(button2);
        buttons.add(button3);
        this.add(textField);
        this.add(buttons);
        this.add(table);

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
        Shape button3Shape = button3.getBounds();
        if(button3Shape.contains(mouseEvent.getPoint())) button3.hover();
        else button3.unhover();
    }
    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
    }

    class ButtonEventListener implements ActionListener {
        int buttonNumber;
        public ButtonEventListener(int n){
            buttonNumber = n;
        }
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            TableModel model = table.getModel();
            System.out.println(model.getValueAt(0,0));
            switch (buttonNumber) {
                case 1:
                    if(model.getValueAt(0,0)!=null || start) {
                        model.setValueAt(textField.getText(), 0, 0);
                        start = false;
                    }
                    break;
                case 2:
                    if(model.getValueAt(0,0)!=null) {
                        model.setValueAt(model.getValueAt(0,0),0,1);
                        model.setValueAt(null,0,0);
                    }
                    break;
                case 3:
                    if(model.getValueAt(0,1)!=null) {
                        model.setValueAt(model.getValueAt(0,1),0,0);
                        model.setValueAt(null,0,1);
                    }
                    break;
            }
        }
    }
}
