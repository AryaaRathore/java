package JAVA2CODE;
class employee{
   private int id;
    private String name;
    private int salary;
    void setDisplay(int id,String name,int salary){
        this.id = id;
        this.name=name;
        this.salary=salary;

    }
    void getDetail(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }
}
public class empDetail {
    public static void main(String[] args) {
        employee obj=new employee();
        obj.setDisplay(12345678, "Arya", 20000);
        obj.getDetail();
    }
    
}
