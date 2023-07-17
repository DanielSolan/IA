import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Database userLogin = new Database("login.txt", 4);
        userLogin.deleteRecord(2);

        System.out.println("SEQUENCE: Program started");
        JFrame splash = new JFrame("Splash Screen");
        splash.setSize(400, 400);
        String imagePath = "C:\\Users\\17solan_d\\IdeaProjects\\IA\\SFSLogo.png";
        BufferedImage logoPic = ImageIO.read(new File(imagePath));
        JLabel logo = new JLabel(new ImageIcon(logoPic));
        splash.add(logo);
        splash.setVisible(true);
        Timer timer = new Timer(2000, new ActionListener(){
            public void actionPerformed(ActionEvent ev) {
                splash.dispose();
                JFrame frame = new JFrame("Default Frame");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                GUIMain myGUI = null;
                try {
                    myGUI = new GUIMain(1920, 1080);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                frame.add(myGUI);
                frame.setVisible(true);
            }
        });
        timer.setRepeats(false);
        timer.start();

    }
}