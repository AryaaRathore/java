public class columWiseSum {
public static void main(String[] args) {
    int[][] arr={{1,2,3,4,5},{4,5,6,7,8}};
    for(int j=0;j<arr[0].length;j++){
        int columsum=0;
        for(int i=0;i<arr.length;i++){
            columsum +=arr[i][j];
        }
        
        System.out.println("sum of colum"+j+":"+columsum);
    }

    }
}    

