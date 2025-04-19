package cse213.reconditionedcarimporter.AuctionAndSales;

import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Vehicle;

import java.time.LocalDate;
import java.util.ArrayList;

public class AuctionDetails {
    private String auctionId, comments;
    private Integer condition_rating;
    private Character letterGrade;
    private LocalDate inspectionDate;
    private int userId;

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

    public AuctionDetails(String auctionId, String comments, Integer condition_rating, Character letterGrade, LocalDate inspectionDate, int userId) {
        this.auctionId = auctionId;
        this.comments = comments;
        this.condition_rating = condition_rating;
        this.letterGrade = letterGrade;
        this.inspectionDate = inspectionDate;
        this.userId = userId;
    }
}
