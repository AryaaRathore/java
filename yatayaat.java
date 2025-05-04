 class vehicle  {
    void drive(){
        System.out.println("driving");
    }
}
    class car extends vehicle{
        void drive2(){
            System.out.println("repairing a car");
        }
    }
    class yatayaat{
    public static void main(String[] args) {
        car obj=new car();
        obj.drive();
        obj.drive2();

        
    }
    
}
 