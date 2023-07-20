import javax.swing.*;
import java.awt.*;

public class GUIAbout extends GUIText {

    public GUIAbout(){
        System.out.println("Creating About page");
        //Set dimensions to fill out typical 16:9 monitor
        this.setPreferredSize(new Dimension(1920, 1080));
        setLayout(null);
        //Basic description to describe purpose of program
        JLabel mainText = new JLabel("This is a student-built project.");
        mainText.setBounds(400, 100, 250, 150);
        add(mainText);
    }
}