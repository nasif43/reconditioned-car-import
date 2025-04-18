package cse213.reconditionedcarimporter.AccouintantandTechnician;

import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Parts;

import java.util.ArrayList;

public class RepairTask {
    private int taskId;
    private String description;
    private float laborHours;
    private ArrayList<Parts> requiredParts;
    private Technician assignedTechnician;
    private String status;
    private Parts parts;
//    private ArrayList<Photo> beforePhotos;
//    private ArrayList<Photo> afterPhotos;

    public RepairTask(String description, int taskId, float laborHours, ArrayList<Parts> requiredParts, Technician assignedTechnician) {
        this.description = description;
        this.taskId = taskId;
        this.laborHours = laborHours;
        this.requiredParts = requiredParts;
        this.assignedTechnician = assignedTechnician;
//        this.beforePhotos = beforePhotos;
//        this.afterPhotos = afterPhotos;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getLaborHours() {
        return laborHours;
    }

    public void setLaborHours(float laborHours) {
        this.laborHours = laborHours;
    }

    public ArrayList<Parts> getRequiredParts() {
        return requiredParts;
    }

    public void setRequiredParts(ArrayList<Parts> requiredParts) {
        this.requiredParts = requiredParts;
    }

    public Technician getAssignedTechnician() {
        return assignedTechnician;
    }

    public void setAssignedTechnician(Technician assignedTechnician) {
        this.assignedTechnician = assignedTechnician;
    }

//    public void setBeforePhotos(ArrayList<Photo> beforePhotos) {
//        this.beforePhotos = beforePhotos;
//    }
//
//    public void setAfterPhotos(ArrayList<Photo> afterPhotos) {
//        this.afterPhotos = afterPhotos;
//    }

    //adding the methoids hjere
    private ArrayList<Photo> beforePhotos = new ArrayList<>();
    private ArrayList<Photo> afterPhotos = new ArrayList<>();
    private ArrayList<PartRequests> partRequests = new ArrayList<PartRequests>();

    // Method to update the task status
    public void updateStatus(String status) {
        this.status = status;
        System.out.println("Task status updated to: " + status);
    }

    // Method to add a photo (before or after repair)
    public void addPhoto(Photo photo, boolean isBefore) {
        if (isBefore) {
            beforePhotos.add(photo);
            System.out.println("Added a 'before' photo.");
        } else {
            afterPhotos.add(photo);
            System.out.println("Added an 'after' photo.");
        }
    }

    // Method to request additional parts
    public void requestAdditionalParts(Parts part, int quantity) {
        String Parts = "";
        PartRequests request = new PartRequests(Parts, quantity);
        partRequests.add(request);
        System.out.println("Requested " + quantity + " of part: " + Parts);
    }

    // Optional: Getters for internal tracking
    public String getStatus() {
        return status;
    }

    public ArrayList<Photo> getBeforePhotos() {
        return beforePhotos;
    }

    public ArrayList<Photo> getAfterPhotos() {
        return afterPhotos;
    }

    public ArrayList<PartRequests> getPartRequests() {
        return partRequests;
    }
}
