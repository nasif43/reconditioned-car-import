package cse213.reconditionedcarimporter;

import cse213.reconditionedcarimporter.AuctionAndSales.BidProposal;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class PreparedBidDetailsController
{
    @javafx.fxml.FXML
    private Label conditionRatingLabel;
    @javafx.fxml.FXML
    private Label auctionHouseNameLabel;
    @javafx.fxml.FXML
    private Label inspectionDateLabel;
    @javafx.fxml.FXML
    private Label vinLabel;
    @javafx.fxml.FXML
    private Label lotNumberLabel;
    @javafx.fxml.FXML
    private Label letterGradeLabel;
    @javafx.fxml.FXML
    private Label evalCommentsLabel;
    @javafx.fxml.FXML
    private Label auctionDateLabel;
    @javafx.fxml.FXML
    private Label idLabel;

    @javafx.fxml.FXML
    public void initialize() {
        loadTempBid();
        deleteTempBid();
    }

    @javafx.fxml.FXML
    public void viewVehicleDetails(ActionEvent actionEvent) {

    }

    public void setPreviewData(BidProposal bidProposal) {
        conditionRatingLabel.setText(bidProposal.getConditionRating());
        auctionHouseNameLabel.setText(bidProposal.getAuctionHouseName());
        vinLabel.setText(bidProposal.getVin());
        lotNumberLabel.setText(bidProposal.getLotNumber().toString());
        letterGradeLabel.setText(bidProposal.getLetterGrade());
        evalCommentsLabel.setText(bidProposal.getEvaluationComments());
        inspectionDateLabel.setText(bidProposal.getInspectionDate().toString());
        auctionDateLabel.setText(bidProposal.getAuctionDate().toString());
        idLabel.setText(bidProposal.getProposalId());
    }

    public void loadTempBid(){
        FileInputStream fis=null;
        ObjectInputStream ois=null;
        try{
            File f = new File("temp.bin");
            if(f.exists()){
                fis = new FileInputStream(f);
            }
            else{
                //Alert: file does not exist
                Alert newAlert = new Alert(Alert.AlertType.INFORMATION);
                newAlert.setTitle("Error");
                newAlert.setHeaderText(null);
                newAlert.setContentText("File does not exist");
            }
            if(fis != null) ois = new ObjectInputStream(fis);

            while(true) {
                BidProposal temp = (BidProposal) ois.readObject();
                setPreviewData(temp);
            }
            //ois.close();

        }
        catch(Exception e){
            try {
                if (ois != null) ois.close();
            }
            catch(Exception e2){
                //
            }
    }

}
    public void deleteTempBid(){
        File f = new File("temp.bin");
        if(f.exists()){
            f.delete();
        }
    }
}