import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File myFile = new File(("fordelete.txt"));
        if(myFile.exists()){
            myFile.delete();
            System.out.println("File successfully deleted.");
        } else {
            System.out.println("File is not exist.");
        }
    }
}
