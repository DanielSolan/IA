import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUISettings extends JPanel {

    static String tester;
    public GUISettings(){
        System.out.println("Creating Settings page");
        this.setPreferredSize(new Dimension(1920, 1080));
        setLayout(null);
        JTextField test = new JTextField();
        test.setBounds(100, 100, 100, 100);
        add(test);
        JButton confirm = new JButton("Enter");
        confirm.setBounds(300, 100, 100, 100);
        add(confirm);
        confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                tester = test.getText();
                JLabel subText1 = new JLabel(tester);
                subText1.setBounds(880, 120, 400, 60);
                add(subText1);
            }
        });

    }
}
