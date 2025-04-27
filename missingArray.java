public class missingArray {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,5};
        int actualsum=0;
        
        int n=5;
        int expectedsum=n*(n+1)/2;
    
        for(int j=0;j<arr.length;j++){
            actualsum=actualsum+arr[j];
        }
        int MissingElement=expectedsum-actualsum;
        System.out.println(MissingElement);
    }
    
    

}
    

