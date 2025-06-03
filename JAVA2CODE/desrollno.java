package JAVA2CODE;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    int rollNo;
    String name;



 public String  toString(){
     return rollNo+" "+name;    
 }

 public Student(int rollNo,String name){
    this.rollNo=rollNo;
    this.name=name;
}

 }

 class sortbyrollNoDes implements  Comparator<Student>{
    public int compare(Student s,Student s1){
        return s1.rollNo-s.rollNo;

    } 
}
public class desrollno {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
      list.add(new Student(1,"Raja"));
          list.add(new Student(6,"krishna"));
          list.add(new Student(7,"Govind"));
          list.add(new Student(2,"ayush"));

          System.out.println("descending roll no:");
        Collections.sort(list,new sortbyrollNoDes());
        for(Student s :list){
            System.out.println(s);
            
        }
        
        
    }
    
}

