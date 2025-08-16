import java.io.File;
import java.io.IOException;

public class CompleteFileOps {
    public static void main(String[] args)  {
        String path = "C:\\Users\\mades\\OneDrive\\Documents\\projects\\FileOperations\\simple";
        File baseDir = new File(path);
        File subDir = new File(baseDir, "subDir");
        File testFile = new File(subDir, "testfile.txt");
        try {
            //create directories
            if(subDir.mkdirs()){
                System.out.println("subdir created successfully!");
            }
            //create testfile
            if(testFile.createNewFile()){
                System.out.println("test file created successfully!");
            }
            //check if path is directory
            System.out.println("\n====Directory Check");
            System.out.println("Is"+subDir.getPath()+" a directory ? "+subDir.isDirectory());
            System.out.println("Is"+testFile.getPath()+" a directory ? "+testFile.isDirectory());

            //list contents
            System.out.println("\n===directory contents===");
            if(baseDir.isDirectory()){
                File[] files = baseDir.listFiles();
                if(files!=null){
                    for(File file:files){
                        String type =  file.isDirectory() ? "[DIR]":"[File]";
                        System.out.println(type+" "+file.getName());
                    }
                }
            }

            //Rename ops
            System.out.println("\n===========rename ops============");
            File renamedFile = new File(subDir, "renamedFile.txt");
            if(testFile.renameTo(renamedFile)){
                System.out.println("File renamed from"+testFile.getName()+" to "+renamedFile.getName());
            }
           
            //rename directory
            File renamedDir = new File(baseDir,"renamedDir");
            if(subDir.renameTo(renamedDir)){
                System.out.println("dir renamed from"+subDir.getName()+" to "+renamedDir.getName());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
