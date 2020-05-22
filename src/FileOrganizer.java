import javax.crypto.spec.PSource;
import javax.naming.spi.DirectoryManager;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;

public class FileOrganizer {

    String rootFolder;
    ArrayList<FileInfo> myFiles = new ArrayList<FileInfo>();

    public FileOrganizer(String location) {
        this.rootFolder = location;
    }

    public ArrayList<FileInfo> getFiles() {
        // Java.IO.File.listFiles
        File[] files = new File(this.rootFolder).listFiles();

        for (File file : files) {
            FileInfo fi = new FileInfo();
            fi.setIsFile(file.isFile());
            fi.setLocation(file.getAbsolutePath());
            fi.setName(file.getName());
            fi.setYear(file.lastModified());

            myFiles.add(fi);
        }

        return myFiles;
    }

    public void MoveFilesByYear(ArrayList<FileInfo> filesToMove, String destinationRootFolder) {
        if(filesToMove == null)
            return;

        if(!IsFolderExists(destinationRootFolder)) {
            CreateFolder(destinationRootFolder);
        }

        for(FileInfo fi : filesToMove) {
            String year = fi.getYear();
            String destinationLocation = destinationRootFolder + "\\" + year;
            if(!IsFolderExists(destinationLocation)) {
                CreateFolder(destinationLocation);
            }

            MoveFile(fi, destinationLocation);
        }
    }

    private void MoveFile(FileInfo fileInfo, String destinationLocation) {
        try {
            Path source = Paths.get(fileInfo.getLocation());
            Path destination = Paths.get(destinationLocation + "\\" + fileInfo.getName());

            System.out.println("Moving...");
            System.out.print("Src: " + source);
            System.out.print(" Des: " + destination + "\n");
            Path temp = Files.move(source, destination);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static boolean IsFolderExists(String folderName) {
        try {
            File file = new File(folderName);
            if (file.exists() && file.isDirectory()) {
                return true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return false;
    }

    private static void CreateFolder(String folderName) {
        try {
            File dir = new File(folderName);
            dir.mkdir();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void testFolderCreation (String place) {
        File f = new File(place + "\\yuh");
        try{
            if(f.mkdir()) {
                System.out.println("done");
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
