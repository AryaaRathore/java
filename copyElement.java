public class copyElement {
    public static void main(String[] args) {
        int[] arr1={7,8,9,0};
        int[] arr2=new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            arr2[i]=arr1[i];

        }
        System.out.println("copied array:");
        for(int val:arr2){
            System.out.print(val+" ");
        }
    }
    
}
