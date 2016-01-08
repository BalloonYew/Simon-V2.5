package SimonV2_5;

import javax.swing.*;
import java.awt.*;

public class PanMain extends JPanel // panel definition
{
    PanDisp panDisp = new PanDisp();
    PanDisp panDisp1 = new PanDisp();
    PanDisp panDisp2 = new PanDisp();
    PanDisp panDisp3 = new PanDisp();
    PanDisp panDisp4 = new PanDisp();
    PanButtons panLabelChange = new PanButtons(panDisp1, panDisp2, panDisp3, panDisp4);

    public PanMain() {
        // this next line tells PanMain that it has a border layout.


        setLayout(new BorderLayout());
        add(panLabelChange, BorderLayout.CENTER);
        add(panDisp1, BorderLayout.WEST);
        add(panDisp2, BorderLayout.EAST);
        add(panDisp3, BorderLayout.SOUTH);
        add(panDisp4, BorderLayout.NORTH);
        setPreferredSize(new Dimension(2000, 2000));

    }
}