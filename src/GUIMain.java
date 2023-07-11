import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class GUIMain extends JPanel{
    JButton guest;
    JButton login;

    public GUIMain(int width, int height) throws IOException {
        System.out.println("Creating GUI");
        this.setPreferredSize(new Dimension(width, height));
        setLayout(null);
        JLabel mainText = new JLabel("Welcome to Simple Fluid Simulation");
        mainText.setBounds(560, 100, 250, 30);
        add(mainText);
        JLabel subText1 = new JLabel("Create whatever fluid you want and push this program to the limit");
        subText1.setBounds(480, 120, 400, 60);
        add(subText1);
        JLabel subText2 = new JLabel("Do you want to use a guest account or your own?");
        subText2.setBounds(520, 200, 300, 30);
        add(subText2);
        guest = new JButton("Guest Account");
        guest.setBounds(480,300, 150, 40);
        login = new JButton("Personal Account");
        login.setBounds(680,300, 150, 40);
        add(guest);
        add(login);
        //TODO; Add login system to login button
        guest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame menu = new JFrame("Main Menu");
                menu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                menu.setExtendedState(JFrame.MAXIMIZED_BOTH);
                GUIMenu men = null;
                men = new GUIMenu();
                menu.add(men);
                menu.setVisible(true);
            }
        });
    }


}
