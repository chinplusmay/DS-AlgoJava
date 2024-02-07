import java.util.Arrays;
public class LinearSearch2D {
    public static void main(String[] args){
        int[][] arr = {
            {1,2,4},
            {1,45,31,55},
            {11,22,34},
            {15,29,3,34,2,425,4}      
        };
        int target = 22;

        int[] ans = search(arr,target);                         // ans will tell index of row n column stored in 1D array int[] ans
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] ar, int targt){
        for(int r=0; r<ar.length;r++){
            for(int c=0; c<ar[r].length;c++){
                if(ar[r][c] == targt){
                    return new int[] {r,c};                      // creating new 1D array thats why new int[] keyword needed
                }
            }
        }
        return new int[] {-1,-1};
    } 
}
