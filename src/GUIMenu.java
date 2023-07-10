import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIMenu extends JPanel {
    JButton Continue = new JButton("Continue");
    JButton settings = new JButton("Settings");
    JButton help = new JButton("Help");
    JButton about = new JButton("About");
    JButton back = new JButton("Back");
    JButton exit = new JButton("Exit");

    public GUIMenu(){
        System.out.println("Creating Menu");
        this.setPreferredSize(new Dimension(1920, 1080));
        setLayout(null);
        Continue.setBounds(100,50, 150, 40);
        settings.setBounds(100,150, 150, 40);
        help.setBounds(100,250, 150, 40);
        about.setBounds(100,350, 150, 40);
        back.setBounds(100,500, 150, 40);
        exit.setBounds(100,600, 150, 40);
        add(Continue);
        add(settings);
        add(help);
        add(about);
        add(back);
        add(exit);
        Continue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        settings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame settings = new JFrame("Settings");
                settings.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                settings.setExtendedState(JFrame.MAXIMIZED_BOTH);
                GUISettings set = null;
                set = new GUISettings();
                settings.add(set);
                settings.setVisible(true);
            }
        });
        help.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        about.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame settings = new JFrame("About");
                settings.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                settings.setExtendedState(JFrame.MAXIMIZED_BOTH);
                GUIAbout ab = null;
                ab = new GUIAbout();
                settings.add(ab);
                settings.setVisible(true);
            }
        });
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        //TODO; Add functionality for all buttons

    }
}
