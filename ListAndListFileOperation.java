import java.io.File;

public class ListAndListFileOperation {
    public static void main(String[] args) {
        String path = "C:\\Users\\mades\\OneDrive\\Documents\\projects\\FileOperations\\simple";
        File directory = new File("C:\\Users\\mades\\OneDrive\\Documents\\projects\\FileOperations\\simple");
        if(directory.exists()){
            String[] fileNames = directory.list();
            if (fileNames!=null){
                System.out.println("Files and directories in "+directory.getPath()+" : ");
                for (String name:fileNames){
                    System.out.println(name);
                }
            }
        } else {
            System.out.println("this is not directory");
        }
        listFiles(path);
    }
    static void listFiles(String path){
        System.out.println("Example of listFiles()");
        File directory = new File(path);
        if(directory.isDirectory()){
            File[] files = directory.listFiles();
            if (files != null) {
                System.out.println("Contents of "+directory.getPath()+" : ");
                for (File file:files){
                    if(file.isDirectory()){
                        System.out.println("[DIR]"+file.getName());
                    } else {
                        System.out.println("[File]"+file.getName());
                    }
                }
            }
        } else {
            System.out.println(directory.getPath()+" is not directory");
        }
    }
}
