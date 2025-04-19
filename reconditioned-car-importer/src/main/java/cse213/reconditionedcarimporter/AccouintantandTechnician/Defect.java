package cse213.reconditionedcarimporter.AccouintantandTechnician;

import java.util.ArrayList;

public class Defect {
    private int defectId;
    private String category;
    private int severity;
    private String description;
    private float estimatedRepairCost;
    private boolean isApprovedForRepair;

    public Defect(int defectId, String category, int severity, String description, float estimatedRepairCost, boolean isApprovedForRepair) {
        this.defectId = defectId;
        this.category = category;
        this.severity = severity;
        this.description = description;
        this.estimatedRepairCost = estimatedRepairCost;
        this.isApprovedForRepair = isApprovedForRepair;
    }

    public int getDefectId() {
        return defectId;
    }

    public void setDefectId(int defectId) {
        this.defectId = defectId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getEstimatedRepairCost() {
        return estimatedRepairCost;
    }

    public void setEstimatedRepairCost(float estimatedRepairCost) {
        this.estimatedRepairCost = estimatedRepairCost;
    }

    public boolean isApprovedForRepair() {
        return isApprovedForRepair;
    }

    public void setApprovedForRepair(boolean approvedForRepair) {
        isApprovedForRepair = approvedForRepair;
    }

//    //adding methods here
//    private ArrayList<Photo> photos = new ArrayList<>();
//    private int severity;
//
//    // Method to add a photo to the defect
//    public void addPhoto(Photo photo) {
//        photos.add(photo);
//    }
//
//    // Method to update the severity of the defect
//    public void updateSeverity(int severity) {
//        this.severity = severity;
//    }
//
//    // Optional: Getters for verification or use elsewhere
//    public ArrayList<Photo> getPhotos() {
//        return photos;
//    }

    public int getSeverity() {
        return severity;
    }
}
