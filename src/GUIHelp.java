import javax.swing.*;
import java.awt.*;

public class GUIHelp extends GUIText {

    public GUIHelp(){
        System.out.println("Creating Help page");
        //Set dimensions to fill out typical 16:9 monitor
        this.setPreferredSize(new Dimension(1920, 1080));
        setLayout(null);
        //Includes text to guide users on how to best use the program
        JLabel mainText = new JLabel("This is a page: Must add ");
        mainText.setBounds(400, 100, 250, 150);
        add(mainText);
    }
}