import javax.swing.*;
import java.awt.*;

public class GUIAbout extends JPanel {

    public GUIAbout(){
        System.out.println("Creating GUI");
        this.setPreferredSize(new Dimension(1920, 1080));
        setLayout(null);
        JLabel mainText = new JLabel("");
        mainText.setBounds(400, 100, 250, 30);
        add(mainText);
    }
}
