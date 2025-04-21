package cse213.reconditionedcarimporter.ImportManagerAndCustomer;

import java.time.LocalDate;

public class TestDrive {
    String Model, enginetype;
    LocalDate dateslot;

    public TestDrive(String model, String enginetype, LocalDate dateslot) {
        Model = model;
        this.enginetype = enginetype;
        this.dateslot = dateslot;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getEnginetype() {
        return enginetype;
    }

    public void setEnginetype(String enginetype) {
        this.enginetype = enginetype;
    }

    public LocalDate getDateslot() {
        return dateslot;
    }

    public void setDateslot(LocalDate dateslot) {
        this.dateslot = dateslot;
    }
}
