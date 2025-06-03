package JAVA2CODE;

class  filedownload{
    public static void download(String file){
        for(int i=1;i<=5;i++){
            System.out.println(file+" "+"downloading..." +(i*20)+ "%");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            
            }
        }
        System.out.println(file + "done");
    }
}
public class threadloading {
    public static void main(String[] args) {
        filedownload obj=new filedownload();
        obj.download("A");
        obj.download("B");
    }
    
}
