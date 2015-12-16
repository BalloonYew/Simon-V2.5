package Layouts1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PanLabelChange extends JPanel // panel definition
{

    PanDisp panDisp1, panDisp2, panDisp3, panDisp4;
    String sName;
    ImageIcon image1;
    ImageIcon image2;
    ImageIcon image3;
    ImageIcon image4;

    public PanLabelChange(PanDisp _panDisp1, PanDisp _panDisp2, PanDisp _panDisp3, PanDisp _panDisp4) {


        image1 = new ImageIcon("H:\\Profile\\Desktop\\JavaSimon\\yellow.png");
        image2 = new ImageIcon("H:\\Profile\\Desktop\\JavaSimon\\red.png");
        image3 = new ImageIcon("H:\\Profile\\Desktop\\JavaSimon\\green.png");
        image4 = new ImageIcon("H:\\Profile\\Desktop\\JavaSimon\\blue.png");




        // ImageIcon scaleImage = image1.getImage().getScaledInstance(28, 28, Image.SCALE_DEFAULT);





        panDisp1 = _panDisp1;
        panDisp2 = _panDisp2;
        panDisp3 = _panDisp3;
        panDisp4 = _panDisp4;

        JButton btn1, btn2, btn3, btn4;
        setLayout(new GridLayout(2, 2));
        btn1 = new JButton("1", image1);
        btn2 = new JButton("2", image2);
        btn3 = new JButton("3", image3);
        btn4 = new JButton("4", image4);




        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);




        // Size Change

       





        class LabelChangeListener implements ActionListener {

            public void actionPerformed(ActionEvent event) {
                JButton btn = (JButton) event.getSource();


                sName = btn.getText(); // gets the text value of the button
                if (sName == "2") {
                    panDisp1.setBackground(Color.red);
                    panDisp2.setBackground(Color.red);
                    panDisp3.setBackground(Color.red);
                    panDisp4.setBackground(Color.red);
                } else if (sName == "4") {
                    panDisp1.setBackground(Color.blue);
                    panDisp2.setBackground(Color.blue);
                    panDisp3.setBackground(Color.blue);
                    panDisp4.setBackground(Color.blue);
                } else if (sName == "3") {
                    panDisp1.setBackground(Color.green);
                    panDisp2.setBackground(Color.green);
                    panDisp3.setBackground(Color.green);
                    panDisp4.setBackground(Color.green);
                } else if (sName == "1") {
                    panDisp1.setBackground(Color.yellow);
                    panDisp2.setBackground(Color.yellow);
                    panDisp3.setBackground(Color.yellow);
                    panDisp4.setBackground(Color.yellow);
                }

                // panDisp.UpdateLabel(sName);
            }
        }
        ActionListener labelChangeListener = new LabelChangeListener();
        btn1.addActionListener(labelChangeListener);
        btn2.addActionListener(labelChangeListener);
        btn3.addActionListener(labelChangeListener);
        btn4.addActionListener(labelChangeListener);
    }
}
