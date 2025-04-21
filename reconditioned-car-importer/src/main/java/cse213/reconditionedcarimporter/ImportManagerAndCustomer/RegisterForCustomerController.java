package cse213.reconditionedcarimporter.ImportManagerAndCustomer;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class RegisterForCustomerController

{

    @javafx.fxml.FXML
    private TextArea AddressTF;
    @javafx.fxml.FXML
    private TextField EmailTF;
    @javafx.fxml.FXML
    private TextField PasswordTF;
    @javafx.fxml.FXML
    private TextField NameTF;

    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void RegisterOnAction(ActionEvent actionEvent) {
        // Get values from fields
        String name = NameTF.getText();
        String email = EmailTF.getText();
        String password = PasswordTF.getText();
        String address = AddressTF.getText();

        // Create Customer object
        RegisterForCustomer newRegister = new Customer(name, email, address, password, 0);



        // Confirm creation
        System.out.println(" Registered: " + newCustomer.getName() + " (" + newCustomer.getEmail() + ")");




    }
}