class Student{
    int age;
    Student(int age){
        this.age=age;
        }
        void data(){
        System.out.println(this);
        
    }
}
public class constructor {
    public static void main(String[] args) {
        Student obj=new Student(17);
       obj.data();
        System.out.println(obj.age);
    }
    
}
