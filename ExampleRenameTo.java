import java.io.File;

public class ExampleRenameTo {
    public static void main(String[] args) {
        String path = "C:\\Users\\mades\\OneDrive\\Documents\\projects\\FileOperations\\simple";
       // renameFile(path); //done
        //renameDirectory(path);
        moveFiletoAnotherDir(path);
    }

    private static void moveFiletoAnotherDir(String path) {
        File sourceFile = new File(path+"\\learning\\hello.txt");
        File targetFile = new File(path+"\\new\\hello.txt");
        File targetDir = targetFile.getParentFile();

        if(!targetDir.exists()){
            targetDir.mkdirs();
        }

        if(sourceFile.exists()){
            if(sourceFile.renameTo(targetFile)){
                System.out.println("File moved successfully!");
                System.out.println("From "+sourceFile.getPath());
                System.out.println("To "+targetFile.getPath());
            } else {
                System.out.println("failed to move file");
            }
        } else {
            System.out.println("Source file not exists");
        }
    }

    private static void renameDirectory(String path) {
        File oldDir = new File(path+"\\files");
        File newDir = new File(path+"\\newFilesto");

        if(oldDir.exists()&&oldDir.isDirectory()){
            if(oldDir.renameTo(newDir)){
                System.out.println("Dir renamed successfully");
                System.out.println("From "+oldDir.getPath());
                System.out.println("To "+newDir.getPath());
            } else {
                System.out.println("Failed to rename");
            }
        } else {
            System.out.println("directory doesn't exists"+oldDir.getPath());
        }
    }

    private static void renameFile(String path) {
        File sourceFile = new File(path+"\\OldFile.txt");
        File targetFile = new File(path+"\\new_file.txt");
        if (sourceFile.exists()){
            if (sourceFile.renameTo(targetFile)){
                System.out.println("File renamed successfully!");
                System.out.println("from:"+sourceFile.getPath());
                System.out.println("to:"+targetFile.getPath());
            } else {
                System.out.println("Failed to rename file");
                System.out.println("possible reasons: target file already exist, "+"Sufficient permissions, or cross file system move");

            }
        } else {
            System.out.println("source file is not exists : "+sourceFile.getPath());
        }
    }
}
