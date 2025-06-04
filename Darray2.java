//print array
public class Darray2 {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4,5},{2,3,4,5,6},{3,4,5,6,7}};//{{i=0},{i=1},{i=2}}=3
                    //{j=0,1,2,3,4} fail5<5      
        for(int i=0;i<arr.length;i++){//i length
            for(int j=0;j<arr[i].length;j++){//arr[0].ltngthis 5
                System.out.print(arr[i][j]+" ");//arr[0][0]
            }
            System.out.println( );

        }
    }
    
}
