import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class filecreate {
    public static void main(String[] args) {
        try {
            File file=new File("new.text");
              
        
            if(file.createNewFile()){
                System.out.println("file created"+file.getName());
            }
            else{
                System.out.println("file already exists.");
            }
                } catch (IOException e) {
            // TODO: handle exception
            System.out.println("an error occured.");
            e.printStackTrace();
        }
    }
    
}
