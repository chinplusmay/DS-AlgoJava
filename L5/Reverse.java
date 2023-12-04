import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Number: ");
        int num = inp.nextInt();
        int ans = 0;
        while( num > 0 ){
            int rem = num % 10;       //last digit//
            num = num / 10;           //delete the last digit //
            ans = ans * 10 + rem;     // refer 51:07 timestamp of lec6 kunalkk//
        }
        System.out.println(ans);
        }
    
}