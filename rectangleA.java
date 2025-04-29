 class area {
    void area_rec(int l,int b){
        System.out.println("area of rectangle "+l*b);
    }

    
}
class rectangleA{
    public static void main(String[] args) {
        area obj= new area();
        obj.area_rec(5,3);
    }//pahle normal class bannate hai uske baad main class
}
//constructor destructor