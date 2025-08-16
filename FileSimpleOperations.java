import java.io.File;

public class FileSimpleOperations {
    public static void main(String[] args) {
        File myFile = new File("example.txt");
        System.out.println(myFile.getName());
        System.out.println(myFile.getAbsoluteFile());
        System.out.println(myFile.getAbsolutePath());
        System.out.println(myFile.length());
        System.out.println(myFile.canRead());
        System.out.println(myFile.canWrite());
        System.out.println(myFile.exists());
        System.out.println(myFile.getPath());
    }
}
