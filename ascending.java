import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    
    String name;
    int rollNo;

public Student(String name,int rollNo){
    
    this.name=name;
    this.rollNo=rollNo;
}

 public String  toString(){
     return name+" "+rollNo;    
 }

 }


class sortbyrollNo implements  Comparator<Student>{
    public int compare(Student s1,Student s2){
        return s1.rollNo-s2.rollNo;

    }

 }
 class ascending {
    public static void main(String[] args) {
    ArrayList<Student> list=new ArrayList<>();
     list.add(new Student( "rahul",54)); 
     list.add(new Student( "rajeev",45)); 
     list.add(new Student( "prem",25));
      list.add(new Student("Aryan",67));
   
       
        System.out.println("according to age:");
        Collections.sort(list,new sortbyrollNo());//rollno acording
        for(Student s1 :list){
            System.out.println(s1);
        }
    }
}


    




