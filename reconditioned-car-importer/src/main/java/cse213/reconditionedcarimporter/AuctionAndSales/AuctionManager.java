package cse213.reconditionedcarimporter.AuctionAndSales;

import cse213.reconditionedcarimporter.AccouintantandTechnician.Payments;
import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Shipment;
import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Vehicle;
import cse213.reconditionedcarimporter.InventoryAndQuality.InspectionReport;
import cse213.reconditionedcarimporter.InventoryAndQuality.Location;
import java.time.LocalDate;
import java.util.ArrayList;

public class AuctionManager extends User {
    public BidProposal preparePreAuctionBid(BidProposal bidProposal) {
        if (validateAuctionDetails(bidProposal)) {
            // Create a new bid proposal based on auction details
            Auction auction = new Auction(
                bidProposal.getProposalId(),
                "Default Auction House", // This should be set based on actual auction house
                LocalDate.now().plusDays(7), // Default to 7 days from now
                "LOT-" + bidProposal.getProposalId(),
                new ArrayList<>(),
                "Pending"
            );
            
            return new BidProposal(
                    // Vehicle will be set later
                    // Initial bid limit
            );
        }
        return null;
    }



    public InspectionReport inspectVehicle(String vehicleId) {
        // In a real implementation, this would create an inspection report
        return new InspectionReport();
    }

    public Shipment arrangeTransportation(Vehicle vehicle, Location location) {
        if (vehicle != null && location != null) {
            return new Shipment();
        }
        return null;
    }

    public Invoice processPayment(Auction auction, Payments payment) {
        if (auction != null && payment != null) {
            return new Invoice(
                generateInvoiceId(),
                payment.getUserId(),
                "Payment for Auction " + auction.getAuctionId(),
                payment.getPaymentMethod(),
                payment.getAmount(),
                false,
                LocalDate.now(),
                LocalDate.now().plusDays(30)
            );
        }
        return null;
    }

    private Boolean validateAuctionDetails(BidProposal bidProposal) {
        return bidProposal != null &&
               bidProposal.getProposalId() != null &&
               !bidProposal.getProposalId().isEmpty() &&
               bidProposal.getConditionRating() != null &&
               Integer.parseInt(bidProposal.getConditionRating()) >= 0 &&
               Integer.parseInt(bidProposal.getConditionRating()) <= 100 &&
               bidProposal.getLetterGrade() != null &&
               bidProposal.getInspectionDate() != null;
    }

    private String generateProposalId() {
        return "PROP-" + System.currentTimeMillis();
    }

    private String generateShipmentId() {
        return "SHIP-" + System.currentTimeMillis();
    }

    private String generateInvoiceId() {
        return "INV-" + System.currentTimeMillis();
    }
}
