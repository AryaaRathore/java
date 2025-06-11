import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readfile {
    public static void main(String[] args) {
        try {
            File file=new File("new.txt");
            Scanner scanner=new Scanner(file);
            while(scanner.hasNextLine()){
                String data=scanner.nextLine();
                 System.out.println(data);
            }
            scanner.close();
            
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            System.out.println("an error occured");
            e.printStackTrace();
        }
    }
    
}
