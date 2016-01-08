package Layouts1;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanDisp extends JPanel // panel definition
{
    private JLabel lblName;
    private String sLabel;

    public PanDisp() {
        lblName = new JLabel("             ");
       add(lblName); //add it to the Frame
        setLayout(new GridLayout(2, 2));
       
        
    }

    void UpdateLabel(String _sNew) {
        sLabel = _sNew;
        lblName.setText(sLabel);
    }
    
}
