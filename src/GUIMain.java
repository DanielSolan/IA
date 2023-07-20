import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class GUIMain extends JPanel{
    JButton guest;
    JButton login;

    public GUIMain(int width, int height) throws IOException {
        //Debugging tool
        System.out.println("Creating GUI");
        //Uses the width and height values passed through from method in main()
        this.setPreferredSize(new Dimension(width, height));
        setLayout(null);
        //
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
                //Dispose_On_Close as opposed to Exit_On_Close: Non-essential window
                menu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                //Maximise the size of the window, relative to the monitor
                menu.setExtendedState(JFrame.MAXIMIZED_BOTH);
                GUIMenu men;
                men = new GUIMenu();
                menu.add(men);
                menu.setVisible(true);
            }
        });
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame login = new JFrame("Login");
                login.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                login.setExtendedState(JFrame.MAXIMIZED_BOTH);
                GUILogin log;
                log = new GUILogin();
                login.add(log);
                login.setVisible(true);
                System.out.println("Do you want to create an account or login to an existing account. A for the first, L for the second");
                Scanner read = new Scanner(System.in);
                String logInput = read.nextLine();
                if (logInput.equals("L")){

                } else if(logInput.equals("A")){
                    System.out.println("A random user ID will be generated and assigned to your account");

                } else{

                }


            }
        });
    }


}
