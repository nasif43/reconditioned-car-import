package cse213.reconditionedcarimporter;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.*;

public class Dasboard
{
    @javafx.fxml.FXML
    private BorderPane borderPaneAuctionManager;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void preBidPrepMenuButtonOnAction(ActionEvent actionEvent) {
        loadFxmlParentToBorderPaneCenter("PreAuctionBidPreperation.fxml");
    }
    private void loadFxmlParentToBorderPaneCenter(String fxmlName){
        try {
            FXMLLoader nextFxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlName));
            borderPaneAuctionManager.setCenter(nextFxmlLoader.load());
        }
        catch(Exception e){
            //
        }
    }
}