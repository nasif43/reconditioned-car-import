package cse213.reconditionedcarimporter;

import cse213.reconditionedcarimporter.AuctionAndSales.BidProposal;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import cse213.reconditionedcarimporter.SetMaxBidLimitController;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;


public class SetMaxBidLimitController
{
    @javafx.fxml.FXML
    private TableColumn maxBidLimitTableColumn;
    @javafx.fxml.FXML
    private TextField filterBidIdTextField;
    @javafx.fxml.FXML
    private TableView preAuctionBidTableView;
    @javafx.fxml.FXML
    private TableColumn bidIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn vinTableColumn;
    @javafx.fxml.FXML
    private TextField SetMaxLimitTextField1;


    @javafx.fxml.FXML
    public void initialize() {
        maxBidLimitTableColumn.setCellValueFactory(new PropertyValueFactory<BidProposal, Float>("maxBidLimit"));
        bidIdTableColumn.setCellValueFactory(new PropertyValueFactory<BidProposal, String>("proposalId"));
        vinTableColumn.setCellValueFactory(new PropertyValueFactory<BidProposal, String>("vin"));
        loadTableFromBinFile();
    }
    @javafx.fxml.FXML
    public void loadTableFromBinFile() {
        FileInputStream fis=null;
        ObjectInputStream ois=null;
        try{
            File f = new File("preAuctionBidPreparation.bin");
            if(f.exists()){
                fis = new FileInputStream(f);
            }
            else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText("Preparation file not found");
                alert.showAndWait();
            }
            if(fis != null) ois = new ObjectInputStream(fis);

            BidProposal proposal = null;
            while(true) {
                proposal = (BidProposal) ois.readObject();
                preAuctionBidTableView.getItems().add(proposal);
                System.out.println(proposal.toString());
            }
        }
        catch(Exception e){
            try {
                if (ois != null) ois.close();
                System.out.println("exited out of while loop");
                System.out.println(e);
            }
            catch(Exception e2){
                //
            }
        }
    }

// basically the button for searching through the vin through the bin and changing the max limit to my own values
    @javafx.fxml.FXML
    public void UpdateMaxBidLimitOnAction(ActionEvent actionEvent) {
        String vin = filterBidIdTextField.getText().trim();
        String maxLimitText = SetMaxLimitTextField1.getText().trim();

        if (vin.isEmpty() || maxLimitText.isEmpty()) {
            showAlert("Input Error", "Please enter both VIN and Max Limit.");
            return;
        }

        try {
            float newMaxLimit = Float.parseFloat(maxLimitText);
            boolean found = false;

            for (Object item : preAuctionBidTableView.getItems()) {
                if (item instanceof BidProposal) {
                    BidProposal proposal = (BidProposal) item;
                    if (proposal.getVin().equals(vin)) {
                        proposal.setMaxBidLimit(newMaxLimit);
                        found = true;
                        break;
                    }
                }
            }

            if (!found) {
                showAlert("Not Found", "VIN not found in proposals.");
                return;
            }

            saveProposalsToBinFile();
            preAuctionBidTableView.refresh(); // Refresh table to show changes
            showAlert("Success", "Max bid limit updated successfully.");

        } catch (NumberFormatException e) {
            showAlert("Invalid Input", "Max Limit must be a valid number.");
        } catch (IOException e) {
            showAlert("Save Error", "Failed to save updated proposals.");
            e.printStackTrace();
        }
    }

    private void saveProposalsToBinFile() throws IOException {
        try (FileOutputStream fos = new FileOutputStream("preAuctionBidPreparation.bin");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            for (Object item : preAuctionBidTableView.getItems()) {
                if (item instanceof BidProposal) {
                    oos.writeObject(item);
                }
            }
        }
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}