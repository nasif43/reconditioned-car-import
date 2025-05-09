package cse213.reconditionedcarimporter.AuctionAndSales;

import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Vehicle;

import java.time.LocalDate;
import java.util.ArrayList;

public class SalesReport {
    private Integer reportId;
    private LocalDate startDate;
    private LocalDate endDate;
    private Float revenue;
    private ArrayList<Vehicle> topSellingModels;
//   TODO private  salesByRegion;
    private Float conversionRate;

    public SalesReport(Integer reportId, LocalDate startDate, LocalDate endDate, Float revenue, ArrayList<Vehicle> topSellingModels, Float conversionRate) {
        this.reportId = reportId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.revenue = revenue;
        this.topSellingModels = topSellingModels;
        this.conversionRate = conversionRate;
    }

    public Integer getReportId() {
        return reportId;
    }

    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Float getRevenue() {
        return revenue;
    }

    public void setRevenue(Float revenue) {
        this.revenue = revenue;
    }

    public ArrayList<Vehicle> getTopSellingModels() {
        return topSellingModels;
    }

    public void setTopSellingModels(ArrayList<Vehicle> topSellingModels) {
        this.topSellingModels = topSellingModels;
    }

    public Float getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(Float conversionRate) {
        this.conversionRate = conversionRate;
    }

    public void exportToPDF() {
        // In a real implementation, this would generate a PDF file
    }

    public void exportToExcel() {
        // In a real implementation, this would generate an Excel file
    }

}
