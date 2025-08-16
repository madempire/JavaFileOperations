import java.io.File;

public class CheckDirectoryExist {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\mades\\OneDrive\\Documents\\projects\\FileOperations\\simple");
        if(file.isDirectory()) //isDirectory is method to validate the file obj is holding directory
        {
            System.out.println(file.getPath()+" is a directory");
        } else {
            System.out.println(file.getPath()+" is not a directory");
        }
    }
}
