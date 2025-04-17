module cse213.reconditionedcarimporter {
    requires javafx.controls;
    requires javafx.fxml;


    exports cse213.reconditionedcarimporter.InventoryAndQuality;
    opens cse213.reconditionedcarimporter.InventoryAndQuality to javafx.fxml;
    exports cse213.reconditionedcarimporter.AuctionAndSales;
    opens cse213.reconditionedcarimporter.AuctionAndSales to javafx.fxml;
}