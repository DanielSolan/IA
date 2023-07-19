public class Account {
    private String userID;
    private float density;
    private float velocity;

    public Account(String userID){
        //Creating an account, without any preferences. Assigns default values to parameters.
        this.userID = userID;
        density = 1.00f;
        velocity = 16.00f;
    }

    public Account(String userID, float density, float velocity){
        //Creates an account, and assigns the given values to the corresponding variables.
        this.userID = userID;
        this.density = density;
        this.velocity = velocity;
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

    public String[] accountArray(){
        String[] fileAcc = new String[3];
        fileAcc[0] = getUserID();
        fileAcc[1] = getDensity();
        fileAcc[2] = getVelocity();
        return fileAcc;
    }

    public String formatAccount(String[] data){
        String account = data.toString();
        return account;
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
}