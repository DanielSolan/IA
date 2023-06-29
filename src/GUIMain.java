import javax.swing.*;
import java.awt.*;

public class GUIMain extends JPanel{
    JButton button1;
    JButton button2;

    public GUIMain(int width, int height) {
        System.out.println("Creating GUI");
        this.setPreferredSize(new Dimension(width, height));
        setLayout(null);
        JLabel mainText = new JLabel("Welcome to Simple Fluid Simulation");
        mainText.setBounds(200, 100, 250, 30);
        add(mainText);
        JLabel subText1 = new JLabel("Create whatever fluid you want and push this program to the limit");
        subText1.setBounds(120, 120, 400, 60);
        add(subText1);
        JLabel subText2 = new JLabel("Do you want to use a guest account or your own?");
        subText2.setBounds(165, 200, 300, 30);
        add(subText2);
        button1 = new JButton("Guest Account");
        button1.setBounds(125,300, 150, 40);
        button2 = new JButton("Personal Account");
        button2.setBounds(325,300, 150, 40);
        add(button1);
        add(button2);
    }

}
