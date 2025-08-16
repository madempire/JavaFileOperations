import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        File myFile = new File("example.txt");
        try {
            if(myFile.createNewFile()){
                System.out.println("File created.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}