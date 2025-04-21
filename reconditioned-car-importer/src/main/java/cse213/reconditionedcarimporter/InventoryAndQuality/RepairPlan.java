package cse213.reconditionedcarimporter.InventoryAndQuality;

import cse213.reconditionedcarimporter.AccouintantandTechnician.RepairTask;
import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Vehicle;

import java.time.LocalDate;
import java.util.ArrayList;

public class RepairPlan {
    private String planId,status;
    private ArrayList<RepairTask> tasks;
    private LocalDate deadline;
    private Vehicle vehicle;
    //methods
    public void createPlan(){};
    public void updateTask(){};
}
