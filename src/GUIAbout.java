import javax.swing.*;
import java.awt.*;

public class GUIAbout extends GUIText {

    public GUIAbout(){
        System.out.println("Creating About page");
        this.setPreferredSize(new Dimension(1920, 1080));
        setLayout(null);
        JLabel mainText = new JLabel("This is a student-built project.");
        mainText.setBounds(400, 100, 250, 150);
        add(mainText);
    }
}
