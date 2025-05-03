class fabonacci{
     static void fabonacci_series(){
        int n1=0;
        int n2=1;
        int count=0;
        int num=10;
        System.out.println(n1);
        System.out.println(n2);
        while(count<num){
            int result =n1+n2;
            System.out.println(result);
            n1=n2;
            n2=result;
            count=count+1;


        }
       

     }
     public static void main(String[] args) {
        fabonacci_series();
     }
}