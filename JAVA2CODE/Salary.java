package JAVA2CODE;
class employee{
    void calculateSalary(){
        System.out.println();
        int s=200000;
    }
}
class Manager extends employee{
    void bonus(){
        System.out.println();
        int bonus=3000;
    }
}
public class Salary {
    public static void main(String[] args) {
        employee obj=new Manager();
        obj.calculateSalary();
        
    }
    
}
