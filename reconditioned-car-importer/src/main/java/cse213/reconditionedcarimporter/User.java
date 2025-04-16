package cse213.reconditionedcarimporter;

public abstract class User {
    private int userId;
    private String name, password, email, phone, userRole;

    public User(int userId, String name, String password, String email, String phone, String userRole) {
        this.userId = userId;
        this.name = name;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.userRole = userRole;
    }

    public User() {
    }

    public Boolean login(){
        return null;
    };
    public void logout(){}
    public Boolean updateProfile(int userId){return null;}
    protected Boolean validateCredentials(){return null;}
}
