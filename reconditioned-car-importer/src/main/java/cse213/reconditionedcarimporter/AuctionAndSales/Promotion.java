package cse213.reconditionedcarimporter.AuctionAndSales;

import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Vehicle;

import java.time.LocalDate;
import java.util.ArrayList;

public class Promotion {
private Integer promotionId; 
private String name;
private Float discountPercentage;
private ArrayList<Vehicle> eligibleModels;
private LocalDate startDate;
private LocalDate endDate;
private Boolean active;

    public Promotion(Integer promotionId, String name, Float discountPercentage, ArrayList<Vehicle> eligibleModels, LocalDate startDate, LocalDate endDate, Boolean active) {
        this.promotionId = promotionId;
        this.name = name;
        this.discountPercentage = discountPercentage;
        this.eligibleModels = eligibleModels;
        this.startDate = startDate;
        this.endDate = endDate;
        this.active = active;
    }

    public Integer getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(Integer promotionId) {
        this.promotionId = promotionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(Float discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public ArrayList<Vehicle> getEligibleModels() {
        return eligibleModels;
    }

    public void setEligibleModels(ArrayList<Vehicle> eligibleModels) {
        this.eligibleModels = eligibleModels;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Float applyPromotion(Invoice invoice) {
        if (active && validateDateRange(startDate, endDate)) {
            return invoice.getAmount() * (1 - discountPercentage / 100);
        }
        return invoice.getAmount();
    }

    public void activate() {
        if (validateDateRange(startDate, endDate)) {
            active = true;
        }
    }

    public void deactivate() {
        active = false;
    }

    private Boolean validateDateRange(LocalDate start, LocalDate end) {
        return start != null && 
               end != null && 
               !start.isAfter(end) && 
               !end.isBefore(LocalDate.now());
    }
}