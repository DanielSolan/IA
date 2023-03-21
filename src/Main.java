import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        FileHandler.createFile("UserLogin");
        Database logins = new Database("logins.txt", 4);
      
        System.out.println("Welcome to Simple Fluid Simulation");
        Scanner input = new Scanner(System.in);
      
        System.out.println("Do you want to use a guest account or your own? True for guest and false otherwise.");
        //User can log in and use their own saved preferences or
        String accountChoice = input.nextLine();
      
        if(accountChoice.equals("Guest")){
            //Proceeds as usual without login or preferences
        } else if(accountChoice.equals("Login")){
            //Prompts user for login details
            System.out.println("Do you have a pre-existing account?");
            String create = input.nextLine();
            Boolean createAcc = Boolean.parseBoolean(create);
            //If the user inputs false, they are prompted to log in.
            if(createAcc==false){
                String ID = "0";
                while(ID.length()!=4){
                    System.out.println("Please can you enter your 4-digit ID:");
                    ID = input.nextLine();
                }
            }
        }
    }
}