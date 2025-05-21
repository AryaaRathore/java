interface client{
    void print();
    void show();
}
class Dev implements client{
    public void print(){
        System.out.println("print the bill");
    }
    public void show(){
       System.out.println("show menu");
    }
}



public class inter {
    public static void main(String[] args){
        Dev obj=new Dev();
        obj.print();
        obj.show();

    }
    
}
