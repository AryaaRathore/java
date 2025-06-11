import java.io.FileWriter;
//write file
public class writfile {
    public static void main(String[] args) {
        try {
            FileWriter writer=new FileWriter("new.txt");
            writer.write("hello, i am arya . who are you?");
            writer.close();
            System.out.println("successfully wrote ");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("an error occured");
            e.printStackTrace();
        }
    }
    
}
