import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class GUILogin extends JPanel {

    public GUILogin(){
        System.out.println("Creating Login page");
        //Set dimensions to fill out typical 16:9 monitor
        this.setPreferredSize(new Dimension(1920, 1080));
        setLayout(null);
        JLabel mainText = new JLabel("Implement login in GUI");
        //TODO: See line above
        mainText.setBounds(400, 100, 250, 150);
        add(mainText);
        Scanner myScan = new Scanner(System.in);
        System.out.println("Please enter your user ID");
        String userID = myScan.nextLine();

    }
}
