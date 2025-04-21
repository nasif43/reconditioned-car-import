package cse213.reconditionedcarimporter.InventoryAndQuality;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class Report implements Serializable {
    protected String reportId;
    protected LocalDate reportDate;

    public Report(String reportId, LocalDate reportDate) {
        this.reportId = reportId;
        this.reportDate = LocalDate.now();

    }

    public Report() {
    }

    public abstract void generateReport();

    public abstract void sendToAccountant(Report report);

    public String getReportId() {
        return reportId;
    }

    public LocalDate getReportDate() {
        return reportDate;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public void setReportDate(LocalDate reportDate) {
        this.reportDate = reportDate;
    }

    @Override
    public String toString() {
        return "Report{" +
                "reportId='" + reportId + '\'' +
                ", reportDate=" + reportDate +
                '}';
    }
}

