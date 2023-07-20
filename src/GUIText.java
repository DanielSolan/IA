import javax.swing.*;
import java.awt.*;

public class GUIText extends JPanel {

    public GUIText(){
        System.out.println("Creating Text page");
        //Set dimensions to fill out typical 16:9 monitor
        this.setPreferredSize(new Dimension(1920, 1080));
        setLayout(null);
        //TODO; Add more common command to reduce code repeating
    }
}
