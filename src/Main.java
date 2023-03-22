import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Database userLogin = new Database("login.txt", 4);

        System.out.println("Welcome to Simple Fluid Simulation");
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to use a guest account or your own? Type G for guest and L to log in.");
        //User can log in and use their own saved preferences or use the app without that.

        String accountChoice = input.nextLine();

        if(accountChoice.equals("G")){
            //Proceeds as usual without login or preferences

        } else if(accountChoice.equals("L")){
            //Prompts user for login details
            System.out.println("Do you have a pre-existing account?");
            String create = input.nextLine();
            Boolean preAcc = Boolean.parseBoolean(create);
            //If the user inputs false, they are prompted to log in.

            if(preAcc==true){
                String ID = "0";

                while(ID.length()!=4){
                    System.out.println("Please can you enter your 4-digit ID:");
                    ID = input.nextLine();
                    //Must check if user ID exists.
                    if(userLogin.findRecord(ID, "login.txt")==false){
                        System.out.println("That ID doesn't exist.");
                    } else{

                    }

                }
            }
        }
    }
}