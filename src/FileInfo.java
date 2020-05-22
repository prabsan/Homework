import java.text.SimpleDateFormat;
import java.util.Date;

public class FileInfo {
    private String year;
    private String name;
    private String location;
    private Date modifiedDate;
    private Boolean isFile;

    public String getName() {
        return this.name;
    }

    public void setName(String fileName) {
        this.name = fileName;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String fileLocation) {
        this.location = fileLocation;
    }

    public Boolean getIsFile() {
        return this.isFile;
    }

    public void setIsFile(Boolean maybeFile) {
        this.isFile = maybeFile;
    }

    public String getYear() {
        return this.year;
    }

    public void setYear(long lastModified) {
        Date d = new Date(lastModified);
        SimpleDateFormat sdf;
        sdf = new SimpleDateFormat("yyyy");
        this.year = sdf.format(d);
    }

    public String toString() {
        return "File Name: " + name + "\nModified Year: " + year + "\nFile Location: " + location + "\nFile?  " + isFile + "\n";
    }

}
