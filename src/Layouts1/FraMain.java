package Layouts1;


// here, I have the colours changing, and the labels changing from one event listener - each. No hard code.

import java.awt.Dimension;
import javax.swing.JFrame;


public class FraMain extends JFrame {

    FraMain() {
        PanMain panMain = new PanMain();
        setSize(750, 650);
        setTitle("Simon Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panMain);
        setResizable(false);
        setVisible(true);
        

    }
}


