package cse213.reconditionedcarimporter;

public class BidProposal {
     private Integer proposalId;
     private Auction auctionDetails;
     private Vehicle vehicle;
     private Float maxBidLimit;
     private String status;

    public BidProposal(Integer proposalId, Auction auctionDetails, Vehicle vehicle, Float maxBidLimit, String status) {
        this.proposalId = proposalId;
        this.auctionDetails = auctionDetails;
        this.vehicle = vehicle;
        this.maxBidLimit = maxBidLimit;
        this.status = status;
    }

    public Integer getProposalId() {
        return proposalId;
    }

    public void setProposalId(Integer proposalId) {
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

    public Boolean sendForReview(){return null;}
    public Boolean update(Float newBidLimit){return null;};
    public Boolean updateProfile(Integer userId){return null;};
    private Boolean validateBidLimit(Float maxBidLimit){return null;};
}
