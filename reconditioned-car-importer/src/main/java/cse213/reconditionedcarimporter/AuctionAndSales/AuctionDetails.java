package cse213.reconditionedcarimporter.AuctionAndSales;

import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Vehicle;

import java.time.LocalDate;

public class AuctionDetails {
    private String auctionId, comments;
    private Integer condition_rating, vehicleId;
    private Character letterGrade;
    private LocalDate inspectionDate;
    private int userId;

    public AuctionDetails(String auctionId, String comments, Integer condition_rating, Integer vehicleId, Character letterGrade, LocalDate inspectionDate, int userId) {
        this.auctionId = auctionId;
        this.comments = comments;
        this.condition_rating = condition_rating;
        this.vehicleId = vehicleId;
        this.letterGrade = letterGrade;
        this.inspectionDate = inspectionDate;
        this.userId = userId;
    }

    public String getAuctionId() {
        return auctionId;
    }

    public void setAuctionId(String auctionId) {
        this.auctionId = auctionId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Integer getCondition_rating() {
        return condition_rating;
    }

    public void setCondition_rating(Integer condition_rating) {
        this.condition_rating = condition_rating;
    }

    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Character getLetterGrade() {
        return letterGrade;
    }

    public void setLetterGrade(Character letterGrade) {
        this.letterGrade = letterGrade;
    }

    public LocalDate getInspectionDate() {
        return inspectionDate;
    }

    public void setInspectionDate(LocalDate inspectionDate) {
        this.inspectionDate = inspectionDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
