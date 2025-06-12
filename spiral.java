public class spiral {
    public static void main(String[] args) {   

        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("spiral travese:");
        for(int i=0;i<=2;i++){
            System.out.print(arr[0][i]+" ");
            
              } 
              for(int i=1;i<=2;i++){
                System.out.print(arr[i][2]+" ");
              }

              for(int k=1;k>=0;k--){
                System.out.print(arr[2][k]+" ");
              }
             
             for(int i=0;i<=1;i++){
              System.out.print(arr[1][i]+" ");
             }
              
        
                
        }
        
    }
    



         //i++,j
//[00 01 02]  i,j++  [1 2 3]   123698745
 // [10 11 12]       [4 5 6]
 //i-,j[20 21 22]i,j--  [7 8 9]