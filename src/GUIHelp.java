import javax.swing.*;
import java.awt.*;

public class GUIHelp extends JPanel {

    public GUIHelp(){
        System.out.println("Creating Help page");
        this.setPreferredSize(new Dimension(1920, 1080));
        setLayout(null);
        JLabel mainText = new JLabel("");
        mainText.setBounds(400, 100, 250, 150);
        add(mainText);
    }
}
