class employee{
    void work(){
        System.out.println("working");
    }

}
class manager extends employee{
    void attendmeeting(){
        System.out.println("attend meeting");
    }
}

public class singleIn {
    public static void main(String[] args) {
      manager obj=new manager();
      obj.work();
      obj.attendmeeting();  
    }
    
}
