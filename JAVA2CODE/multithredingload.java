package JAVA2CODE;

class downloadFile extends Thread {
    String fileName;
   public downloadFile(String fileName){
    this.fileName=fileName;
   }
   public void run(){
    for(int i=1;i<=5;i++){
        System.out.println(fileName +" "+"downloading..." +(i*20) +"%");
        try {
            Thread.sleep(2000);
        } 
        catch (Exception e) {
            
        }

    }
    System.out.println(fileName+" "+"done");
   }
    
}
public class multithredingload {
    public static void main(String[] args) {
        downloadFile obj=new downloadFile("file A");
        downloadFile obj1=new downloadFile("file B");
        obj.start();
        obj1.start();
        
        
    }
    
}
