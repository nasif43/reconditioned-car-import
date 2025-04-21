package cse213.reconditionedcarimporter.InventoryAndQuality;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Notification implements Serializable {
    private  String message;
    private LocalDate time;
    private boolean isRead;
    private String type;
    private String relatedId;

    public Notification(String message, LocalDate time, boolean isRead, String type) {
        this.message = message;
        this.time = time;
        this.isRead = isRead;
        this.type = type;
    }

    public Notification(String message, LocalDate time, boolean isRead, String type, String relatedId) {
        this.message = message;
        this.time = time;
        this.isRead = isRead;
        this.type = type;
        this.relatedId = relatedId;
    }

    public Notification() {
    }

    public void markAsRead() {
        this.isRead = true;
    }


    public String getMessage() {
        return message;
    }

    public LocalDate getTime() {
        return time;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRelatedId() {
        return relatedId;
    }

    public void setRelatedId(String relatedId) {
        this.relatedId = relatedId;
    }
}