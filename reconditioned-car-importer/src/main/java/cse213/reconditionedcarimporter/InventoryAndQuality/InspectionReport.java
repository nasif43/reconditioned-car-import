package cse213.reconditionedcarimporter.InventoryAndQuality;

import java.time.LocalDate;

public class InspectionReport {
    private int reportId,exteriorRating,interiorRating,
            mechanicalRating,finalGrade ;
    private Vehicle vehicle;
    private LocalDate inspectionDate ;
    private ArrayList<Defect>  defects ;
    private ArrayList<String> photos ;

    //methods
    public int calculateFinalGrade(){return null;};
    public void addDefect(){};
    public Report generateReport(){return null;};
    public boolean approveForRepairs(){return null;};


}
