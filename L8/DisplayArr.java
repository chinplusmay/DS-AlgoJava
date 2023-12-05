import java.util.Arrays;
import java.util.Scanner;
// There are 3 ways to display values of array
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
            System.out.print(arr[i] + " ");      // here i is just traversing through all the index of array not actually fetching the real values
        }

        System.out.print("\nThe elements are: ");
        for(int n: arr){                        //this is (for each) loop here loop is fetching the values of arr then giving it to n //
            System.out.print(n + " ");          
        }

        System.out.println("\nThe elements are: " + Arrays.toString(arr)); // easiest way to print the elements of an array

    }
}
