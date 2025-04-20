package cse213.reconditionedcarimporter.ImportManagerAndCustomer;

import cse213.reconditionedcarimporter.AccouintantandTechnician.Payments;
import cse213.reconditionedcarimporter.AuctionAndSales.Order;
import cse213.reconditionedcarimporter.AuctionAndSales.User;

import java.time.LocalDate;
import java.util.ArrayList;

public class ImportManager extends User {

    private ArrayList<CarListing> listings = new ArrayList<>();
    private ArrayList<PurchaseRequest> processedRequests = new ArrayList<>();
    private ArrayList<Order> supplierOrders = new ArrayList<>();
    private ArrayList<Shipment> shipments = new ArrayList<>();

    // 1️⃣ Add a new car listing
    public boolean manageCarListings(CarListing listing) {
        if (listing != null) {
            listings.add(listing);
            System.out.println("Listing added: " + listing.getListingId());
            return true;
        }
        return false;
    }

    // 2️⃣ Approve a pending customer request
    public boolean processCustomerPurchaseRequests(PurchaseRequest request) {
        if (request != null && "Pending".equalsIgnoreCase(request.getStatus())) {
            request.setStatus("Approved");
            processedRequests.add(request);
            System.out.println("Approved request for: " + request.getVehicle().getModel());
            return true;
        }
        return false;
    }

    // 3️⃣ Place a supplier order
    public Order manageSupplierOrders(String supplier, Vehicle vehicle) {
        if (supplier != null && vehicle != null) {
            Order order = new Order(1000 + supplierOrders.size(), supplier, vehicle);
            supplierOrders.add(order);
            System.out.println("Supplier order placed with: " + supplier);
            return order;
        }
        return null;
    }

    // 4️⃣ Create a shipment for a vehicle
    public Shipment overseeShippingAndLogistics(Vehicle vehicle) {
        if (vehicle != null) {
            Shipment shipment = new Shipment(
                    100 + shipments.size(),
                    new ArrayList<>() {{ add(vehicle); }},
                    "Tokyo Warehouse",
                    "Chittagong Port",
                    LocalDate.now(),
                    LocalDate.now().plusDays(14),
                    "In Transit",
                    "Maersk",
                    null
            );
            shipments.add(shipment);
            System.out.println("Shipment created for: " + vehicle.getModel());
            return shipment;
        }
        return null;
    }

    // 5️⃣ Approve payment if valid
    public boolean verifyAndApprovePayments(Payments payment) {
        if (payment != null && payment.getAmount() > 0) {
            payment.setStatus("Approved");
            System.out.println("Payment approved for: " + payment.getTransactionId());
            return true;
        }
        return false;
    }
}
