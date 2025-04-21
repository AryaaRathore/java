public class RowWiseSum {
public static void main(String[] args) {
    int[][] arr={{1,2,3,4,5},{4,5,6,7,8}};
    for(int i=0;i<arr.length;i++){
        int Rowsum=0;
        for(int j=0;j<arr[i].length;j++){
            Rowsum +=arr[i][j];
        }
        
        System.out.println("sum of row"+i+":"+Rowsum);
    }

    }
}    

