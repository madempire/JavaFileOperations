import java.io.File;

public class MkdirAndMkdirsEx {
    public static void main(String[] args) {
        String path = "C:\\Users\\mades\\OneDrive\\Documents\\projects\\FileOperations\\simple";
        mkdirEx(path);
        mkdirsEx(path);
    }
    static void mkdirEx(String path){
        File newDirectory = new File(path+"\\ExpertInCoding");
        if(newDirectory.mkdir()) // mkdir only create directory if the parent directory is already available or else generate an error
        {
            System.out.println("Directory created successfully : "+newDirectory.getName());
        }
        else {
            System.out.println("Failed to create directory "+newDirectory.getPath());
            System.out.println("Possible reasons : parent directory doesn't exist or directory already exists");
        }
    }
    static void mkdirsEx(String path){
        File newDirectoryStructure = new File(path+"\\learning\\files");
        if (newDirectoryStructure.mkdirs()){
            System.out.println("Directory Structure created successfully:"+newDirectoryStructure.getPath());
        } else {
            System.out.println("Failed to create directory structure or it already exists:"+newDirectoryStructure.getPath());
        }

        //alternative approach with error check

        File anotherDir = new File(path+"\\new\\dir");
        if(!anotherDir.exists()){
            if(anotherDir.mkdirs()){
                System.out.println("Created"+anotherDir.getPath());
            } else {
                System.out.println("Already exists"+anotherDir.getPath());
            }
        } else {
            System.out.println("already exists:"+anotherDir.getPath());
        }
    }
}
