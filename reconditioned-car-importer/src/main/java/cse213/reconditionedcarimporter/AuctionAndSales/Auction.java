package cse213.reconditionedcarimporter.AuctionAndSales;
import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Vehicle;

import java.time.LocalDate;
import java.util.ArrayList;

public class Auction {
    private String auctionId;
    private String auctionHouse;
    private LocalDate auctionDate;
    private String lotNumber;
    private ArrayList<Vehicle> vehicles;
    private String status;

    public Auction(String auctionId, String auctionHouse, LocalDate auctionDate, String lotNumber, ArrayList<Vehicle> vehicles, String status) {
        this.auctionId = auctionId;
        this.auctionHouse = auctionHouse;
        this.auctionDate = auctionDate;
        this.lotNumber = lotNumber;
        this.vehicles = vehicles;
        this.status = status;
    }

    public String getAuctionId() {
        return auctionId;
    }

    public void setAuctionId(String auctionId) {
        this.auctionId = auctionId;
    }

    public String getAuctionHouse() {
        return auctionHouse;
    }

    public void setAuctionHouse(String auctionHouse) {
        this.auctionHouse = auctionHouse;
    }

    public LocalDate getAuctionDate() {
        return auctionDate;
    }

    public void setAuctionDate(LocalDate auctionDate) {
        if (validateAuctionDate(auctionDate)) {
            this.auctionDate = auctionDate;
        }
    }

    public String getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean addVehicle(Vehicle vehicle){return null;}
    private Boolean validateAuctionDate(LocalDate auctionDate) {
        return auctionDate != null && !auctionDate.isBefore(LocalDate.now());
    }
}
