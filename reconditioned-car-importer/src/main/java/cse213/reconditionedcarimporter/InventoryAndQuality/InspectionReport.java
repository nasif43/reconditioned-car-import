package cse213.reconditionedcarimporter.InventoryAndQuality;

import cse213.reconditionedcarimporter.AccouintantandTechnician.Defect;
import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Vehicle;

import java.time.LocalDate;
import java.util.ArrayList;

public class InspectionReport {
    private int reportId,exteriorRating,interiorRating,
            mechanicalRating,finalGrade ;
    private Vehicle vehicle;
    private LocalDate inspectionDate ;
    private ArrayList<Defect> defects ;
    private ArrayList<String> photos ;

    //methods
    public int calculateFinalGrade(){;
        return 0;
    }
    public void addDefect(){};
    public boolean approveForRepairs(){return false;}


}
