package cse213.reconditionedcarimporter;

import cse213.reconditionedcarimporter.AuctionAndSales.BidProposal;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class PreparedBidTabularView
{
    @javafx.fxml.FXML
    private TextField filterBidIdTextField;
    @javafx.fxml.FXML
    private TableView<BidProposal> preAuctionBidTableView;
    @javafx.fxml.FXML
    private TableColumn<BidProposal, String> bidIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<BidProposal, String> vinTableColumn;
    @javafx.fxml.FXML
    private TableColumn<BidProposal, Float> maxBidLimitTableColumn;
    @javafx.fxml.FXML
    private TableColumn<BidProposal, Integer> lotNumberTableColumn;
    @javafx.fxml.FXML
    private TableColumn<BidProposal, String> auctionHouseNameTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
        auctionHouseNameTableColumn.setCellValueFactory(new PropertyValueFactory<BidProposal, String>("auctionHouseName"));
        lotNumberTableColumn.setCellValueFactory(new PropertyValueFactory<BidProposal, Integer>("lotNumber"));
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
                if(proposal.getMaxBidLimit()==null){
                    proposal.setMaxBidLimit(0f);
                }
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
    @javafx.fxml.FXML
    public void filerBidIdViewDetailsButtonOnAction(ActionEvent actionEvent) {
        String id = filterBidIdTextField.getText();
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
                    if(proposal.getProposalId().equals(id)){
                        proposal.previewBidProposal();
                    }
                }
            }
            catch(Exception e){
                try {
                    if (ois != null) ois.close();
                    try {
                        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("PreparedBidDetailsView.fxml"));
                        Parent root = fxmlLoader.load();
                        Stage stage = new Stage();
                        stage.setTitle("Preview");
                        stage.setScene(new Scene(root));
                        stage.show();
                    } catch (IOException e3) {
                        System.out.println("Error loading fxml");
                    }
                    System.out.println("exited out of while loop");
                    System.out.println(e);
                }
                catch(Exception e2){
                    //
                }
            }
        }

    }
