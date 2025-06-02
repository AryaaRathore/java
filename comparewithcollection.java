import java.util.ArrayList;
import java.util.Collections;

 class Student implements Comparable<Student>{
    int age;
    String name;

public Student(int age,String name){
    this.age=age;
    this.name=name;
}

 public String  toString(){
     return age+" "+name;    
 }

 public int compareTo(Student s){
    return this.age-s.age;
 }

 }
 class comparewithcollection {
    public static void main(String[] args) {
    ArrayList<Student> list=new ArrayList<>();
     list.add(new Student(18, "rahul")); 
     list.add(new Student(11, "rajeev")); 
     list.add(new Student(19, "prem"));
      list.add(new Student(13, "Aryan"));
   
      Collections.sort(list);
      for(Student s:list){
        System.out.println(s.toString());
      }  
    }


    
}
