package Layouts1;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanLabelChange extends JPanel{ // panel definition
    PanDisp panDisp1, panDisp2, panDisp3, panDisp4;
    String sName;
    ImageIcon imageYell;
    ImageIcon imageRed;
    ImageIcon imageGreen;
    ImageIcon imageBlue;
    ImageIcon imageDarkYell;
    ImageIcon imageDarkRed;
    ImageIcon imageDarkGreen;
    ImageIcon imageDarkBlue;
    JButton btnYell, btnRed, btnGreen, btnBlue;

    public PanLabelChange(PanDisp _panDisp1, PanDisp _panDisp2, PanDisp _panDisp3, PanDisp _panDisp4) {

        //Images being loaded in
        imageYell = new ImageIcon("H:\\Profile\\Desktop\\JavaSimon\\yellow.png");
        imageRed = new ImageIcon("H:\\Profile\\Desktop\\JavaSimon\\red.png");
        imageGreen = new ImageIcon("H:\\Profile\\Desktop\\JavaSimon\\green.png");
        imageBlue = new ImageIcon("H:\\Profile\\Desktop\\JavaSimon\\blue.png");
        imageDarkYell = new ImageIcon("H:\\Profile\\Desktop\\JavaSimon\\yellowDark.png");
        imageDarkRed = new ImageIcon("H:\\Profile\\Desktop\\JavaSimon\\redDark.png");
        imageDarkGreen = new ImageIcon("H:\\Profile\\Desktop\\JavaSimon\\greenDark.png");
        imageDarkBlue = new ImageIcon("H:\\Profile\\Desktop\\JavaSimon\\blueDark.png");

        panDisp1 = _panDisp1;
        panDisp2 = _panDisp2;
        panDisp3 = _panDisp3;
        panDisp4 = _panDisp4;

//set layout and gives each button a name and the image associated with it
        setLayout(new GridLayout(2, 2));
        btnYell = new JButton("1", imageDarkYell);
        btnRed = new JButton("2", imageDarkRed);
        btnGreen = new JButton("3", imageDarkGreen);
        btnBlue = new JButton("4", imageDarkBlue);

        add(btnYell);
        add(btnRed);
        add(btnGreen);
        add(btnBlue);

        btnYell.setPressedIcon(imageYell);
        btnRed.setPressedIcon(imageRed);
        btnGreen.setPressedIcon(imageGreen);
        btnBlue.setPressedIcon(imageBlue);

        class LabelChangeListener implements ActionListener {

            public void actionPerformed(ActionEvent event) {
                JButton btn = (JButton) event.getSource();
                sName = btn.getText(); // gets the text value of the button


                //Changes the four background pannes colours
                //RED
                if (sName == "2") {
                    panDisp1.setBackground(Color.red);
                    panDisp2.setBackground(Color.red);
                    panDisp3.setBackground(Color.red);
                    panDisp4.setBackground(Color.red);


                    //BLUE
                } else if (sName == "4") {
                    panDisp1.setBackground(Color.blue.darker());
                    panDisp2.setBackground(Color.blue.darker());
                    panDisp3.setBackground(Color.blue.darker());
                    panDisp4.setBackground(Color.blue.darker());


                    //GREEN
                } else if (sName == "3") {
                    panDisp1.setBackground(Color.green.darker());
                    panDisp2.setBackground(Color.green.darker());
                    panDisp3.setBackground(Color.green.darker());
                    panDisp4.setBackground(Color.green.darker());

                    //YELLOW
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
        btnYell.addActionListener(labelChangeListener);
        btnRed.addActionListener(labelChangeListener);
        btnGreen.addActionListener(labelChangeListener);
        btnBlue.addActionListener(labelChangeListener);





    }
}
