import javax.swing.*;
import java.awt.*;

public class GUIMenu extends JPanel {
    JButton Continue = new JButton("Continue");
    JButton settings = new JButton("Settings");
    JButton help = new JButton("Help");
    JButton about = new JButton("About");
    JButton exit = new JButton("Exit");

    public GUIMenu(){
        System.out.println("Creating GUI");
        this.setPreferredSize(new Dimension(1920, 1080));
        setLayout(null);
        Continue.setBounds(100,100, 150, 40);
        settings.setBounds(100,200, 150, 40);
        help.setBounds(100,300, 150, 40);
        about.setBounds(100,400, 150, 40);
        exit.setBounds(100,600, 150, 40);
        add(Continue);
        add(settings);
        add(help);
        add(about);
        add(exit);
        //TODO; Add functionality for all buttons

    }
}
