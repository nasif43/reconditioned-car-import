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

    public RepairPlan(String planId, String status, ArrayList<RepairTask> tasks, LocalDate deadline, Vehicle vehicle) {
        this.planId = planId;
        this.status = status;
        this.tasks = tasks;
        this.deadline = deadline;
        this.vehicle = vehicle;
    }

    public RepairPlan() {
    }

    //methods
    public void createPlan(){};
    public void updateTask(){};

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<RepairTask> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<RepairTask> tasks) {
        this.tasks = tasks;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
