import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        File myFile = new File("example.txt");

        if(myFile.exists()){
            try {
                FileWriter writer = new FileWriter(myFile,true); // if we add second parameter true it updates or else update everything.
                writer.write("My first file writing operation\n");
                System.out.println("Writing to the file has been done.");
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("File not found");
        }

    }
}
