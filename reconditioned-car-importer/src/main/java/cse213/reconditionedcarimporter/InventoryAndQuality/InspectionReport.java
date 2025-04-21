package cse213.reconditionedcarimporter.InventoryAndQuality;

import cse213.reconditionedcarimporter.AccouintantandTechnician.Defect;
import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Vehicle;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class InspectionReport extends Report implements Serializable {
    private int exteriorRating,interiorRating,
            mechanicalRating,finalGrade ;
    private Vehicle vehicle;
    private LocalDate inspectionDate ;
    private ArrayList<Defect>  defects ;
    private ArrayList<String> photos ;

    public InspectionReport(String reportId, LocalDate reportDate, int reportId1, int exteriorRating, int interiorRating, int mechanicalRating, int finalGrade, Vehicle vehicle, LocalDate inspectionDate, ArrayList<Defect> defects, ArrayList<String> photos) {
        super(reportId, reportDate);
        this.exteriorRating = exteriorRating;
        this.interiorRating = interiorRating;
        this.mechanicalRating = mechanicalRating;
        this.finalGrade = finalGrade;
        this.vehicle = vehicle;
        this.inspectionDate = inspectionDate;
        this.defects = defects;
        this.photos = photos;
    }

    public InspectionReport() {
    }

    //methods
    public int calculateFinalGrade(){return 0;};
    public void addDefect(){};
    @Override
    public void generateReport(){};
    public boolean approveForRepairs(){return false;};
    @Override
    public void sendToAccountant(Report report){};


    public int getExteriorRating() {
        return exteriorRating;
    }

    public void setExteriorRating(int exteriorRating) {
        this.exteriorRating = exteriorRating;
    }

    public int getInteriorRating() {
        return interiorRating;
    }

    public void setInteriorRating(int interiorRating) {
        this.interiorRating = interiorRating;
    }

    public int getMechanicalRating() {
        return mechanicalRating;
    }

    public void setMechanicalRating(int mechanicalRating) {
        this.mechanicalRating = mechanicalRating;
    }

    public int getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(int finalGrade) {
        this.finalGrade = finalGrade;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDate getInspectionDate() {
        return inspectionDate;
    }

    public void setInspectionDate(LocalDate inspectionDate) {
        this.inspectionDate = inspectionDate;
    }

    public ArrayList<Defect> getDefects() {
        return defects;
    }

    public void setDefects(ArrayList<Defect> defects) {
        this.defects = defects;
    }

    public ArrayList<String> getPhotos() {
        return photos;
    }

    public void setPhotos(ArrayList<String> photos) {
        this.photos = photos;
    }

}
