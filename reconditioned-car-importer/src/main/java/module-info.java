module cse213.reconditionedcarimporter {
    requires javafx.controls;
    requires javafx.fxml;


    opens cse213.reconditionedcarimporter to javafx.fxml;
    exports cse213.reconditionedcarimporter;
    exports cse213.reconditionedcarimporter.InventoryAndQuality;
    opens cse213.reconditionedcarimporter.InventoryAndQuality to javafx.fxml;
}