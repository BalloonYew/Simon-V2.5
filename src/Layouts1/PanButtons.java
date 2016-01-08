package Layouts1;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TimerTask;
import java.util.Timer;

public class PanButtons extends JPanel { // panel definition

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
    JButton btnYell, btnRed, btnGreen, btnBlue, btnStart;
    int arnComp[] = new int[5];
    int arnUser[] = new int[5];
    boolean CompTurn = true;
    int j = 0;
    int nCount = 0;
    int nL = 0, nW = 0;
    boolean Start = false;

    public PanButtons(PanDisp _panDisp1, PanDisp _panDisp2, PanDisp _panDisp3, PanDisp _panDisp4) {

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
//        time = new Timer(1000, (ActionListener) task);
//set layout and gives each button a name and the image associated with it
        setLayout(new GridLayout(3, 3));
        btnYell = new JButton("1", imageDarkYell);
        btnRed = new JButton("2", imageDarkRed);
        btnGreen = new JButton("3", imageDarkGreen);
        btnBlue = new JButton("4", imageDarkBlue);
        btnStart = new JButton("Start");

        add(btnYell);
        add(btnRed);
        add(btnGreen);
        add(btnBlue);
        add(btnStart);

        btnYell.setPressedIcon(imageYell);
        btnRed.setPressedIcon(imageRed);
        btnGreen.setPressedIcon(imageGreen);
        btnBlue.setPressedIcon(imageBlue);






        class LabelChangeListener implements ActionListener {

            Timer timer = new Timer();
            TimerTask tTask = new TimerTask() {
                @Override
                public void run() {
                    int a = 0;
                    a++;
                }
            };

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
                    arnUser[j] = 2;
                    j++;


                    //BLUE
                } else if (sName == "4") {
                    panDisp1.setBackground(Color.blue.darker());
                    panDisp2.setBackground(Color.blue.darker());
                    panDisp3.setBackground(Color.blue.darker());
                    panDisp4.setBackground(Color.blue.darker());
                    arnUser[j] = 4;
                    j++;


                    //GREEN
                } else if (sName == "3") {
                    panDisp1.setBackground(Color.green.darker());
                    panDisp2.setBackground(Color.green.darker());
                    panDisp3.setBackground(Color.green.darker());
                    panDisp4.setBackground(Color.green.darker());
                    arnUser[j] = 3;
                    j++;

                    //YELLOW
                } else if (sName == "1") {
                    panDisp1.setBackground(Color.yellow);
                    panDisp2.setBackground(Color.yellow);
                    panDisp3.setBackground(Color.yellow);
                    panDisp4.setBackground(Color.yellow);
                    arnUser[j] = 1;
                    j++;

                } else if (sName == "Start") {
                    Start = true;
                    for (int i = 0; i < 5; i++) {
                        arnComp[i] = (int) (Math.random() * 4 + 1);
                        if(arnComp[i] == 1){
                            btnYell.doClick();
                            timer.scheduleAtFixedRate(tTask, 0, 1000);
                        }
                        if(arnComp[i] == 2){
                            btnRed.doClick();
                            timer.scheduleAtFixedRate(tTask, 0, 1000);
                        }
                        if(arnComp[i] == 3){
                            btnYell.doClick();
                            timer.scheduleAtFixedRate(tTask, 0, 1000);
                        }
                        if(arnComp[i] == 4){
                            btnYell.doClick();
                            timer.scheduleAtFixedRate(tTask, 0, 1000);
                        }
                        System.out.println(arnComp[i]);
                    }
                    j = 0;
                    nCount = 0;
                    nW = 0;
                    nL = 0;

                }

                if (j == 5) {
                    for (int i = 0; i < 5; i++) {
                        System.out.println(arnComp[i] + " " + arnUser[i]);
                        if (arnComp[i] == arnUser[i]) {
                            nCount++;

                        }
                    }
                    if (nCount == 5) {
                        nW++;
                        JOptionPane.showMessageDialog(null, "You Win");

                    } else {
                        nL++;
                        JOptionPane.showMessageDialog(null, "You Lose");
                    }
                    nCount = 0;
                    System.out.println("win " + nW + " Lose " + nL);
                    j = 0;
                    for (int i = 0; i < 5; i++) {
                        arnComp[i] = (int) (Math.random() * 4 + 1);
                        System.out.println(arnComp[i]);
                    }
                    Start = true;
                }

//                if (Start) {
//                    for (int i = 0; i < 5; i++) {
//                        if (arnComp[i] == 1) { //Yellow Button
//                            //Make the blue button look like it was clicked
//                            btnYell.setIcon(imageYell);
//                            timer.scheduleAtFixedRate(tTask, 1000, 1000);
//                            btnYell.setIcon(imageDarkYell);
//                            //Pause the execution for one second (if the arraylist has more
//                            //than one item it needs to pause in between each color lighting up)
//
//
//                        } else if (arnComp[i] == 2) { //Red Button
//                            btnRed.setIcon(imageRed);
//                            timer.scheduleAtFixedRate(tTask, 1000, 1000);
//                            btnRed.setIcon(imageDarkRed);
//
//                        } else if (arnComp[i] == 3) {  //Green Button
//                            btnGreen.setIcon(imageGreen);
//                            timer.scheduleAtFixedRate(tTask, 1000, 1000);
//                            btnGreen.setIcon(imageDarkGreen);
//
//                        } else if (arnComp[i] == 4) {  //Blue Button
//                            btnBlue.setIcon(imageBlue);
//                            timer.scheduleAtFixedRate(tTask, 1000, 1000);
//                            btnBlue.setIcon(imageDarkBlue);
//                        }
//                    }
//                    Start = false;
//                }

//                while (CompTurn) {
//                    for (int i = 0; i < 4; i++) {
//                        if (arnComp[i] == 1) {
//                            btnYell.setIcon(imageYell);
//                            timer.scheduleAtFixedRate(tTask, 1000, 1000);
//                            btnYell.setIcon(imageDarkYell);
//
//                        }
//                        else if (arnComp[i] == 2) {
//                            btnRed.setIcon(imageRed);
//                            timer.scheduleAtFixedRate(tTask, 1000, 1000);
//                            btnRed.setIcon(imageDarkRed);
//                        }
//                        else if (arnComp[i] == 3) {
//                            btnGreen.setIcon(imageGreen);
//                            timer.scheduleAtFixedRate(tTask, 1000, 1000);
//                            btnGreen.setIcon(imageDarkGreen);
//                        }
//                        else if (arnComp[i] == 4) {
//                            btnBlue.setIcon(imageBlue);
//                            timer.scheduleAtFixedRate(tTask, 1000, 1000);
//                            btnBlue.setIcon(imageDarkBlue);
//                        }
//                    }
//                    CompTurn = false;
//                }
            }
        }
        ActionListener labelChangeListener = new LabelChangeListener();

        btnYell.addActionListener(labelChangeListener);

        btnRed.addActionListener(labelChangeListener);

        btnGreen.addActionListener(labelChangeListener);

        btnBlue.addActionListener(labelChangeListener);

        btnStart.addActionListener(labelChangeListener);
    }
}