public class Account {
    private String userID;
    private float density;
    private float velocity;
    public static int resolution = 2;

    public Account(String userID){
        //Creating an account, without any preferences. Assigns default values to parameters.
        this.userID = userID;
        density = 1.00f;
        velocity = 16.00f;
        resolution = 2;
    }

    public Account(String userID, float density, float velocity){
        //Creates an account, and assigns the given values to the corresponding variables.
        this.userID = userID;
        this.density = density;
        this.velocity = velocity;
        resolution = 2;
    }

    public void getUserDetails(){
        //Prints out all user details on an account.
        System.out.println("User Details:");
        System.out.println("User ID:" + userID);
        System.out.println("Density:" + String.valueOf(density));
        System.out.println("Velocity:" + String.valueOf(velocity));
    }

    public void setDensity(float newValue){
        //set a new value for density
        density = newValue;
    }

    public void setVelocity(float newValue){
        //set a new value for velocity
        velocity = newValue;
    }

    public void setRes(int newValue){
        //set a new value for velocity
        resolution = newValue;
    }

    public String accountString(){
        String fileAcc = userID + String.valueOf(resolution);
        return fileAcc;
    }

    //Get methods for all three variables, used for file handling.
    public String getUserID(){
        return userID;
    }

    public String getDensity(){
        return String.valueOf(density);
    }

    public String getVelocity(){
        return String.valueOf(velocity);
    }

    public int getRes(){
        return resolution;
    }
}