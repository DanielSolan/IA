public class Account {
    private String userID;
    private float density;
    private float velocity;

    public Account(String userID){
        this.userID = userID;
        density = 1.00f;
        velocity = 1.00f;
    }

    public Account(String userID, float density, float velocity){
        this.userID = userID;
        this.density = density;
        this.velocity = velocity;
    }

    public void getUserDetails(){
        System.out.println("User Details:");
        System.out.println("User ID:" + userID);
        System.out.println("Density:" + String.valueOf(density));
        System.out.println("Velocity:" + String.valueOf(velocity));
    }

    public void setDensity(float newValue){
        density = newValue;
    }

    public void setVelocity(float newValue){
        velocity = newValue;
    }
}
