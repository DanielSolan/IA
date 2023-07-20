import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class GUISettings extends JPanel {

    public GUISettings(){
        System.out.println("Creating Settings page");
        //Set dimensions to fill out typical 16:9 monitor
        this.setPreferredSize(new Dimension(1920, 1080));
        setLayout(null);
        JTextField test = new JTextField();
        test.setBounds(100, 100, 100, 100);
        add(test);
        JButton confirm = new JButton("Enter");
        confirm.setBounds(300, 100, 100, 100);
        add(confirm);
        JLabel mainText = new JLabel("Resolution: 1 - Very detailed, very taxing. 2 - Ideal, good detail and decent performance. 3 - Better performance with decent detail. 4 - Best performance, worst detail");
        mainText.setBounds(400, 100, 600, 150);
        add(mainText);
        Scanner myS = new Scanner(System.in);
        System.out.println("What resolution do you want?");
        GlobalVariables.resolution = Integer.parseInt(myS.nextLine());
        confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String tester = test.getText();
                JLabel subText1 = new JLabel(tester);
                subText1.setBounds(880, 120, 400, 60);
                add(subText1);
            }
        });

    }
}
