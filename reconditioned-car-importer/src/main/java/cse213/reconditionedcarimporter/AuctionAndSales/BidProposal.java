package cse213.reconditionedcarimporter.AuctionAndSales;

import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Vehicle;

public class BidProposal {
     private String proposalId;
     private Auction auctionDetails;
     private Vehicle vehicle;
     private Float maxBidLimit;
     private String status;

    public BidProposal(String proposalId, Auction auctionDetails, Vehicle vehicle, Float maxBidLimit, String status) {
        this.proposalId = proposalId;
        this.auctionDetails = auctionDetails;
        this.vehicle = vehicle;
        this.maxBidLimit = maxBidLimit;
        this.status = status;
    }

    public BidProposal(String proposalId, Auction auction, Vehicle vehicle, float maxBidLimit, String draft) {

    }

    public String getProposalId() {
        return proposalId;
    }

    public void setProposalId(String proposalId) {
        this.proposalId = proposalId;
    }

    public Auction getAuctionDetails() {
        return auctionDetails;
    }

    public void setAuctionDetails(Auction auctionDetails) {
        this.auctionDetails = auctionDetails;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Float getMaxBidLimit() {
        return maxBidLimit;
    }

    public void setMaxBidLimit(Float maxBidLimit) {
        this.maxBidLimit = maxBidLimit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean sendForReview() {
        if (validateBidLimit(maxBidLimit)) {
            status = "Under Review";
            return true;
        }
        return false;
    }

    public Boolean update(Float newBidLimit) {
        if (validateBidLimit(newBidLimit)) {
            maxBidLimit = newBidLimit;
            return true;
        }
        return false;
    }

    public Boolean updateProfile(Integer userId) {
        // In a real implementation, this would update the user profile in a database
        return userId != null && userId > 0;
    }

    private Boolean validateBidLimit(Float maxBidLimit) {
        return maxBidLimit != null && maxBidLimit > 0;
    }
}
