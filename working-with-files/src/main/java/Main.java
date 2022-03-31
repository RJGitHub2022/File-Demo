import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    private static final Path  filePath = Paths.get(System.getProperty("user.dir") + "\\resources\\sample_data.txt");
    //private static final Path filePathForMac = Paths.get("C\\FannnieProject\\files-demo\\working-with-files");


    public static void main(String[] args) throws IOException {
        String welcome = "welcome to files!";
        System.out.println(welcome);

        //Create
        System.out.println("\nCalling the create a file methodd.");
        createAFile();

        //Update
        System.out.println("\nCalling the update method.");
        writeToAFile();

        //Read
        System.out.println("\nCalling the read a file method");
        readAFile();

        //Delete
        System.out.println("\nCalling the delete a file method.");
        deleteAFile();




    }

    ///Create
    public static void createAFile(){
        try {
            Files.createFile(filePath);
         } catch (Exception e){
            e.printStackTrace();

        }

    }

    //Read
    public static void readAFile(){
        String temp;
        try {
            temp = Files.readString(filePath);
            System.out.println(temp);
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    //Update
    public static void writeToAFile(){
        try {
            Files.writeString(filePath, "This is the end my Friend...");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //Delete
    public static void deleteAFile() throws IOException {
        Files.delete(filePath);

    }
}
