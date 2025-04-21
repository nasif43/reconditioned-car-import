package cse213.reconditionedcarimporter.ImportManagerAndCustomer;

public class RegisterForCustomer {
    private String Name, Email, Password, Address;

    public RegisterForCustomer(String name, String email, String password, String address) {
        Name = name;
        Email = email;
        Password = password;
        Address = address;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
