package cse213.reconditionedcarimporter.AuctionAndSales;

import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Shipment;
import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Vehicle;
import cse213.reconditionedcarimporter.InventoryAndQuality.Location;

public class AuctionManager extends User {
    public BidProposal preparePreAuctionBid(AuctionDetails auctionDetails){return null;}
    public void auditAuctionResults(String auctionRef){}
    public void inspectVehicle(String vehicleId){}
    public Shipment arrangeTransportation(Vehicle vehicle, Location location){}
//    public Invoice processPayment(Auction auction, Payment payment){return null;}
    private Boolean validateAuctionDetails(AuctionDetails auctionDetails){return null;}
}
