import java.util.ArrayList;
import java.util.Scanner;
public class InOutArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of the array");
        int n = in.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter Elements: ");
        for(int i=0; i < n;i++){
            list.add(in.nextInt());
        }

        //Output 2 ways
        for(int i=0; i<n; i++){ 
            System.out.print(list.get(i) + " ");
        }
        System.out.println(list + " ");

    }
}
