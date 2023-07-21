import javax.swing.*;
import java.awt.*;
import java.util.Random;
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
        System.out.println("Do you want to login to a preexisting account or create a new one?");
        String input = myScan.nextLine();
        if(input.equals("Login")){
            System.out.println("Please enter your user ID");
            String userID = myScan.nextLine();
            if(FileHandler.containsElement("login.txt", userID)){
                System.out.println("Your user ID has been found");
                System.out.println("Loading settings...");
                int fileIndex = FileHandler.elementIndex("login.txt", userID);
                String wholeLine = FileHandler.readLineAt("login.txt", fileIndex);
                GlobalVariables.resolution = Integer.parseInt(wholeLine.substring(4,5));
            }
        } else{
            Random r = new Random( System.currentTimeMillis() );
            String newID = String.valueOf(((1 + r.nextInt(2)) * 10000 + r.nextInt(10000)));
            Account user = new Account("newID");
            FileHandler.appendLine("login.txt", user.accountString());

        }
    }
}
