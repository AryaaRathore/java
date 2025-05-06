
class arya{
    int age;
    void data(int age){
        this.age=age;
        System.out.println(this);
    }
}
 public class ThisKey {
 public static void main(String[] args) {
    arya obj=new arya();
    obj.data(23);
   System.out.println(obj.age);
 }   
}