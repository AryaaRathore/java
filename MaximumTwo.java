public class MaximumTwo {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int[] arr2={7,8,4};
        int max=Integer.MIN_VALUE;
        for(int val:arr1){
            if(val>max){
                max=val;
            }

        }
        for(int val:arr2){
            if(val>max){
                max=val;
            }
        }
        System.out.println("Maximum Element:"+max);
    }
    
}
