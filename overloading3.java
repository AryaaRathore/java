class area{
    void shape(int l,int b){
        System.out.println("rectangle "+l*b);
    }
    void shape(int l,int b,int h){
        System.out.println("cube "+l*b*h);
    }


}
class overloading3 {
    public static void main(String[] args) {
        area obj=new area();
        obj.shape(4, 5);
        obj.shape(4, 5, 6);
        
    }
    
}
