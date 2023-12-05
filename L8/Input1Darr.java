import java.util.Arrays;
import java.util.Scanner;
public class Input1Darr {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int[] iA = new int[5];
        System.out.print("Enter no to add in the int array: ");
        for(int k=0; k < iA.length; k++){
            iA[k] = inp.nextInt();
        }
        System.out.println("int array: " + Arrays.toString(iA));
    
        String[] sA = new String[4];
        System.out.print("Enter Strings to add in the String array: ");
        for(int i = 0 ; i < sA.length; i++){
            sA[i] = inp.next();
        }
        System.out.println("String array: " + Arrays.toString(sA));


    }
}
