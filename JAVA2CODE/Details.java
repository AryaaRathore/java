package JAVA2CODE;
class Student{
   private String name;
   private int marks;
   void setValue(String name,int marks){
    this.name=name;
    this.marks=marks;
   }
   void  getValue(){
    System.out.println(name);
    System.out.println(marks);

   }
}

public class Details {
    public static void main(String[] args) {
        Student obj=new Student();
        obj.setValue("Arya",90);
        obj.getValue();
    }
    
}
