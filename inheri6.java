class parent{
    void sum(int a){
        System.out.println(a);
    }
    void sum(int a, int b){
        System.out.println(a+b);
    }
    void sum(int a,int b, int c){
        System.out.println(a+b+c);
    }
}
class child extends parent{
    void sum(int a){
        System.out.println(a);
    }

}


class inheri6 {
    public static void main(String[] args) {
        child obj=new child();
        obj.sum(20);
        obj.sum(400, 20);
        obj.sum(400, 20, 30);
        
    }

    
}
