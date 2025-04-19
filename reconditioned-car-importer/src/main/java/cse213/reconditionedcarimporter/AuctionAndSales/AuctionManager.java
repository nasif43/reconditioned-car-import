package cse213.reconditionedcarimporter.AuctionAndSales;

import cse213.reconditionedcarimporter.AccouintantandTechnician.Payments;
import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Shipment;
import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Vehicle;
import cse213.reconditionedcarimporter.InventoryAndQuality.InspectionReport;
import cse213.reconditionedcarimporter.InventoryAndQuality.Location;

public class AuctionManager extends User {
    public BidProposal preparePreAuctionBid(AuctionDetails auctionDetails){return null;}
    public AuctionDetails auditAuctionResults(String auctionRef){return null;}
    public InspectionReport inspectVehicle(String vehicleId){return null;}
    public Shipment arrangeTransportation(Vehicle vehicle, Location location){return null;}
    public Invoice processPayment(Auction auction, Payments payment){return null;}
    private Boolean validateAuctionDetails(AuctionDetails auctionDetails){return null;}
}
