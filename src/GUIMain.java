import javax.swing.*;
import java.awt.*;

public class GUIMain extends JPanel{
    JButton button1;
    JButton button2;

    public GUIMain(int width, int height) {
        System.out.println("Creating GUI");
        this.setPreferredSize(new Dimension(width, height));
        setLayout(null);
        button1 = new JButton("b1");
        button1.setBounds(0,0, 100, 40);
        button2 = new JButton("b2");
        button2.setBounds(120,0, 100, 40);
        add(button1);
        add(button2);
    }

}
