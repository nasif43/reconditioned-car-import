package cse213.reconditionedcarimporter.AccouintantandTechnician;

import cse213.reconditionedcarimporter.utility.AppendableObjectOutputStream;
import javafx.collections.ObservableList;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Equipment implements Serializable {

    private String equipmentId;
    private String name;
    private String type;
    private String status;

    public Equipment(String equipmentId, String name, String type, ObservableList<String> status) {
        this.equipmentId = equipmentId;
        this.name = name;
        this.type = type;
        this.status = String.valueOf(status);
    }

    public String getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public void saveEquipment() {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            File f = new File( "Equipment.bin" );
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
