import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIMenu extends JPanel {
    //All the buttons to be used in the panel
    JButton Continue = new JButton("Simulate");
    JButton settings = new JButton("Settings");
    JButton help = new JButton("Help");
    JButton about = new JButton("About");
    JButton back = new JButton("Back");
    JButton exit = new JButton("Exit");

    public GUIMenu(){
        //For debugging
        System.out.println("Creating Menu");
        //Set dimensions to fill out typical 16:9 monitor
        this.setPreferredSize(new Dimension(1920, 1080));
        setLayout(null);
        //Set bounds for the buttons, placing them in a vertical column to the left of the window.
        Continue.setBounds(100,50, 150, 40);
        settings.setBounds(100,150, 150, 40);
        help.setBounds(100,250, 150, 40);
        about.setBounds(100,350, 150, 40);
        back.setBounds(100,500, 150, 40);
        exit.setBounds(100,600, 150, 40);
        //Add the buttons to the GUI
        add(Continue);
        add(settings);
        add(help);
        add(about);
        add(back);
        add(exit);
        Continue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Calls the method to start the simulation
                LatticeBoltzmann.main();
                //For debugging
                System.out.println("Simulation started");
            }
        });
        settings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Create new JFrame for settings page
                JFrame settings = new JFrame("Settings");
                //Dispose_On_Close as opposed to Exit_On_Close: Non-essential window
                settings.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                //Maximise the size of the window, relative to the monitor
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
                JFrame help = new JFrame("Help");
                //Dispose_On_Close as opposed to Exit_On_Close: Non-essential window
                help.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                //Maximise the size of the window, relative to the monitor
                help.setExtendedState(JFrame.MAXIMIZED_BOTH);
                GUIHelp ab = null;
                ab = new GUIHelp();
                help.add(ab);
                help.setVisible(true);
            }
        });
        about.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame settings = new JFrame("About");
                //Dispose_On_Close as opposed to Exit_On_Close: Non-essential window
                settings.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                //Maximise the size of the window, relative to the monitor
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
                //TODO; Dispose window upon button press
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
