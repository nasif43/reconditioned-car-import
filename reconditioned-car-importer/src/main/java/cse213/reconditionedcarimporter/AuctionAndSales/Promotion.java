package cse213.reconditionedcarimporter.AuctionAndSales;

import java.time.LocalDate;

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

public Float applyPromotion(Order order){
    return null;
};
public void activate(){}
public void deactivate(){}
private Boolean validateDateRange(LocalDate start, LocalDate end){return null;};
}