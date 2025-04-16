package cse213.reconditionedcarimporter;

import cse213.reconditionedcarimporter.InventoryAndQuality.Location;

public class AuctionManager extends User {
    public BidProposal preparePreAuctionBid(AuctionDetails auctionDetails){return null;}
    public AuctionReport auditAuctionResults(String auctionRef){return null;}
    public InspectionReport inspectVehicle(String vehicleId){return null;}
    public ShippingDetails arrangeTransportation(Vehicle vehicle, Location location){return null;}
    public Invoice processPayment(Auction auction, Payment payment){return null;}
    private Boolean validateAuctionDetails(AuctionDetails auctionDetails){return null;}
}
