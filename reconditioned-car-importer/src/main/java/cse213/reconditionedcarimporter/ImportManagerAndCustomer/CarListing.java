package cse213.reconditionedcarimporter.ImportManagerAndCustomer;

import java.util.ArrayList;

public class CarListing {

    private String listingId;                  // Unique ID for this listing
    private String title;                      // e.g., "New Arrival: Japanese Cars"
    private String description;                // Summary about the listing
    private String createdBy;                  // Name or ID of the Import Manager
    private String createdDate;                // When the listing was created
    public ArrayList<Vehicle> carList;

    public String getListingId() {
        return listingId;
    }

    public void setListingId(String listingId) {
        this.listingId = listingId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public ArrayList<Vehicle> getCarList() {
        return carList;
    }

    public void setCarList(ArrayList<Vehicle> carList) {
        this.carList = carList;
    }

    public CarListing(String listingId, String title, String description, String createdBy, String createdDate, ArrayList<Vehicle> carList) {
        this.listingId = listingId;
        this.title = title;
        this.description = description;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.carList = carList;

    }
}
