public class BubbleSort {
    static void Bubble_Sort(int[] arr){
    
    for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
        
            }
        }
        
    }
    for( int k=0;k<arr.length;k++){
        System.out.println(arr[k]);

    }
}
    public static void main(String[] args) {
        int[] arr={7,1,0,4,2,9,3};
        Bubble_Sort(arr);
    }


    
}
