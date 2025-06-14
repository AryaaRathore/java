package JAVA2CODE;

public class evenprint {

    
    public static void main(String[] args) {
        String str="I am Arya Rathore";
        String[] words=str.split(" ");
        for(int i=0;i<=words.length;i++){
            if((i+1)%2==0){
                System.out.println(words[i]);
            }
        }

    }
    
}


