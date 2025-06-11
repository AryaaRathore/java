import java.io.File;

public class deletefile {
    public static void main(String[] args) {
       File file=new File("new.txt");
        if(file.delete()){
            System.out.println("delete  file:"+file.getName());

        }
        else{
            System.out.println("failed  file delete");
        }
    }
    
}
