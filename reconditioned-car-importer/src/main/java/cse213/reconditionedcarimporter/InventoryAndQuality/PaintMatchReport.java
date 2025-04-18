package cse213.reconditionedcarimporter.InventoryAndQuality;

import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Vehicle;

import java.time.LocalDate;

public class PaintMatchReport extends Report {
    private final Vehicle vehicle;
    private final boolean paintMatched;
    private final String annotations;
    //methods

    public PaintMatchReport(String reportId, Vehicle vehicle,boolean paintMatched,String annotations) {
        this.reportId = reportId;
        this.vehicle = vehicle;
        this.paintMatched = paintMatched;
        this.annotations = annotations;
    }

    public static PaintMatchReport generateReport(Vehicle vehicle, boolean paintMatched, String notes) {
        String reportId = "PAINT-" + LocalDate.now().toString() + "-" + vehicle.getVin();
        return new PaintMatchReport(reportId, vehicle, paintMatched, notes);
    }

    @Override
    public void generateReport() {

    }

    @Override
    public void sendToAccountant(Report report) {

    }

    // Getters
    public String getReportId() { return reportId; }
    public Vehicle getVehicle() { return vehicle; }
    public boolean isPaintMatched() { return paintMatched; }
    public String getAnnotations() { return annotations; }
    public LocalDate getInspectionDate() { return reportDate; }
}