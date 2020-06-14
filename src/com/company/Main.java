package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame window = new JFrame();
        JFrame.setDefaultLookAndFeelDecorated(true);

        GroupConsistsOfElementsJTextFieldJComboBoxJButton groupConsistsOfElementsJTextFieldJComboBoxJButton = new GroupConsistsOfElementsJTextFieldJComboBoxJButton();
        GroupConsistsOfElementsJTextFieldJButton1JButton2 groupConsistsOfElementsJTextFieldJButton1JButton2 = new GroupConsistsOfElementsJTextFieldJButton1JButton2();
        GroupConsistsOfElementsJTextFieldJButtonJRadioButtons groupConsistsOfElementsJTextFieldJButtonJRadioButtons = new GroupConsistsOfElementsJTextFieldJButtonJRadioButtons();
        GroupConsistsOfElementsJTextFieldJButtonJCheckBoxes groupConsistsOfElementsJTextFieldJButtonJCheckBoxes = new GroupConsistsOfElementsJTextFieldJButtonJCheckBoxes();
        GroupConsistsOfElementsJTextFieldJButtonsJTable groupConsistsOfElementsJTextFieldJButtonsJTable = new GroupConsistsOfElementsJTextFieldJButtonsJTable();

        groupConsistsOfElementsJTextFieldJComboBoxJButton.setPreferredSize(new Dimension(300,100));
        groupConsistsOfElementsJTextFieldJButton1JButton2.setPreferredSize(new Dimension(300,100));
        groupConsistsOfElementsJTextFieldJButtonJRadioButtons.setPreferredSize(new Dimension(300,100));
        groupConsistsOfElementsJTextFieldJButtonJCheckBoxes.setPreferredSize(new Dimension(300,100));
        groupConsistsOfElementsJTextFieldJButtonsJTable.setPreferredSize(new Dimension(300,350));

        window.setLayout(new FlowLayout(FlowLayout.LEFT));
        window.add(groupConsistsOfElementsJTextFieldJComboBoxJButton);
        window.add(groupConsistsOfElementsJTextFieldJButton1JButton2);
        window.add(groupConsistsOfElementsJTextFieldJButtonJRadioButtons);
        window.add(groupConsistsOfElementsJTextFieldJButtonJCheckBoxes);
        window.add(groupConsistsOfElementsJTextFieldJButtonsJTable);

        window.setPreferredSize(new Dimension(1300, 700));
        window.pack();
        window.setVisible(true);
        window.setLocationRelativeTo(null);
    }
}