package cse213.reconditionedcarimporter.AccouintantandTechnician;

public class Photo {
    private int photoId;
    private String fileName;
    private String filePath;
    private String description;
    private String timestamp;

    public Photo(int photoId, String fileName, String filePath, String description, String timestamp) {
        this.photoId = photoId;
        this.fileName = fileName;
        this.filePath = filePath;
        this.description = description;
        this.timestamp = timestamp;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    ;
    public void tagPhoto(String tag) {
        // TODO: implement
    }

    public void deletePhoto() {
        // TODO: implement
    }
}
