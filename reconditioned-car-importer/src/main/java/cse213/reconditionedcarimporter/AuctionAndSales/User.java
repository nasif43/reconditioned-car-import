package cse213.reconditionedcarimporter.AuctionAndSales;

import java.util.Objects;

public abstract class User {
    private String name, password, email, phone, userRole, userId;

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getUserRole() {
        return userRole;
    }

    public String getUserId() {
        return userId;
    }

    public User(String userId, String name, String password, String email, String phone, String userRole) {
        this.userId = userId;
        this.name = name;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.userRole = userRole;
    }

    public User() {
    }

    public Boolean login() {
        return validateCredentials();
    }

    public void logout() {
        // In a real implementation, this would clear session data
    }

    public Boolean updateProfile(int userId) {
        return userId > 0;
    }

    protected Boolean validateCredentials() {
        return !Objects.equals(userId, "") &&
               name != null && 
               !name.isEmpty() && 
               password != null && 
               !password.isEmpty() && 
               email != null && 
               !email.isEmpty();
    }
}
