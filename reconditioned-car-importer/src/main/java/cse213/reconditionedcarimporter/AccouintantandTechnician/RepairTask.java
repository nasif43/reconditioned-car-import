package cse213.reconditionedcarimporter.AccouintantandTechnician;

import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Parts;
import cse213.reconditionedcarimporter.utility.AppendableObjectOutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class RepairTask implements Serializable {
    private String vin;
    private String taskId;
    private String description;
    private String beforephoto;
    private String afterphoto;

    public RepairTask(String vin, String taskId, String description, String beforephoto, String afterphoto) {
        this.vin = vin;
        this.taskId = taskId;
        this.description = description;
        this.beforephoto = beforephoto;
        this.afterphoto = afterphoto;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBeforephoto() {
        return beforephoto;
    }

    public void setBeforephoto(String beforephoto) {
        this.beforephoto = beforephoto;
    }

    public String getAfterphoto() {
        return afterphoto;
    }

    public void setAfterphoto(String afterphoto) {
        this.afterphoto = afterphoto;
    }

    public void saveRepairTask() {
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;
            try{
                File f = new File( "RepairTask.bin" );
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





