package cse213.reconditionedcarimporter;

public abstract class User {
    private int userId;
    private String name, password, email, phone, userRole;

    public Boolean login(){
        return null;
    };
    public void logout(){}
    public Boolean updateProfile(int userId){return null;}
    protected Boolean validateCredentials(){return null;}
}
