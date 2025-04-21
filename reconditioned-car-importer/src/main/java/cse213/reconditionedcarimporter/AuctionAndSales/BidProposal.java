package cse213.reconditionedcarimporter.AuctionAndSales;

import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Vehicle;
import cse213.reconditionedcarimporter.utility.AppendableObjectOutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Scanner;

public class BidProposal implements Serializable {
     private String proposalId;
     private String auctionHouseName;
     private Integer lotNumber;
     private String vin;
     private String conditionRating;
     private String letterGrade;
     private String evaluationComments;
     private LocalDate auctionDate;
     private LocalDate inspectionDate;
     private Float maxBidLimit;

    public String getProposalId() {
        return proposalId;
    }

    public void setProposalId(String proposalId) {
        this.proposalId = proposalId;
    }

    public String getAuctionHouseName() {
        return auctionHouseName;
    }

    public void setAuctionHouseName(String auctionHouseName) {
        this.auctionHouseName = auctionHouseName;
    }

    public Integer getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(Integer lotNumber) {
        this.lotNumber = lotNumber;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getConditionRating() {
        return conditionRating;
    }

    public void setConditionRating(String conditionRating) {
        this.conditionRating = conditionRating;
    }

    public String getLetterGrade() {
        return letterGrade;
    }

    public void setLetterGrade(String letterGrade) {
        this.letterGrade = letterGrade;
    }

    public String getEvaluationComments() {
        return evaluationComments;
    }

    public void setEvaluationComments(String evaluationComments) {
        this.evaluationComments = evaluationComments;
    }

    public LocalDate getAuctionDate() {
        return auctionDate;
    }

    public void setAuctionDate(LocalDate auctionDate) {
        this.auctionDate = auctionDate;
    }

    public LocalDate getInspectionDate() {
        return inspectionDate;
    }

    public void setInspectionDate(LocalDate inspectionDate) {
        this.inspectionDate = inspectionDate;
    }

    public Float getMaxBidLimit() {
        return maxBidLimit;
    }

    public void setMaxBidLimit(Float maxBidLimit) {
        this.maxBidLimit = maxBidLimit;
    }

    public BidProposal(String proposalId, String auctionHouseName, Integer lotNumber, String vin, String conditionRating, String letterGrade, String evaluationComments, LocalDate auctionDate, LocalDate inspectionDate) {
        this.proposalId = proposalId;
        this.auctionHouseName = auctionHouseName;
        this.lotNumber = lotNumber;
        this.vin = vin;
        this.conditionRating = conditionRating;
        this.letterGrade = letterGrade;
        this.evaluationComments = evaluationComments;
        this.auctionDate = auctionDate;
        this.inspectionDate = inspectionDate;
    }

    public BidProposal(){

    }

    public void viewBidProposal(){

    }
    public void previewBidProposal(){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            File f = new File( "temp.bin" );
                oos = new ObjectOutputStream(new FileOutputStream(f));
            oos.writeObject(this);
            oos.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void saveBidProposal(){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            File f = new File( "preAuctionBidPreparation.bin" );
            if(f.exists()){
                oos = new AppendableObjectOutputStream(new FileOutputStream(f, true));}
            else{
                oos = new ObjectOutputStream(new FileOutputStream(f));}
            oos.writeObject(this);
            oos.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
