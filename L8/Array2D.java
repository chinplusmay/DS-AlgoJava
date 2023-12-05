import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        /*
             1 2 3
             4 5 6
             7 8 9
        */
    Scanner in = new Scanner(System.in);
//        int[][] arr = new int[3][];

//        int[][] arr = {
//                {1, 2, 3}, // 0th index
//                {4, 5}, // 1st index
//                {6, 7, 8, 9} // 2nd index -> arr[2] = {6, 7, 8, 9}
//        }; 
    // input
    System.out.print("Enter 3x3 matrix elements: ");
    int[][] arr = new int[3][3];
    for (int r=0;r < arr.length; r++) {                            // r= rows c=columns
        for(int c=0;c < arr[r].length; c++) {                      // arr of (r)th index is also a array (columns) // for each col in every row
            arr[r][c] = in.nextInt();
        }
    }
    //output
    //First Way : 
    System.out.println("2DArray is :");
    for(int r=0; r < arr.length ; r++){
        for(int c=0; c < arr[r].length; c++) {
            System.out.print(arr[r][c] + " ");
        }
        System.out.println(" ");                      // to have new after each row (Print i matrix format)
    }

    //Second Way :
    System.out.println("2DArray is :");
    for(int r=0; r < arr.length ; r++){
        System.out.println(Arrays.toString(arr[r]));
    }

    //Third Way : 
    System.out.println("2DArray is :");
    for(int[] e : arr){
        System.out.println(Arrays.toString(e));
    }

    }
}
