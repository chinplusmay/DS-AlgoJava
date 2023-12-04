import java.util.Arrays;
import java.util.Scanner;
public class DisplayArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter nums to enter in String: ");
        for(int i = 0; i<arr.length;i++){
            arr[i] = in.nextInt();
        }

        System.out.print("The elements are: ");
        for(int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i] + " ");      // here i is jsut traversing through all the index of array not actually fetching the real value
        }

        System.out.print("\nThe elements are: ");
        for(int n: arr){
            System.out.print(n + " ");          //this is for each loop here loop is fetching the values of arr then giving it to n //
        }

        System.out.println("\nThe elements are: " + Arrays.toString(arr)); // easiest way to print the elements of an array

    }
}
