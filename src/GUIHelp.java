import javax.swing.*;
import java.awt.*;

public class GUIHelp extends GUIText {

    public GUIHelp(){
        System.out.println("Creating Help page");
        this.setPreferredSize(new Dimension(1920, 1080));
        setLayout(null);
        JLabel mainText = new JLabel("This is a page ");
        mainText.setBounds(400, 100, 250, 150);
        add(mainText);
    }
}