// Armstrong number (3 digits)
import java.util.Scanner;       //An Armstrong number is a number that is equal to the sum of its digits raised to the power of the number of digits//
public class IsArmstrong3 {       // For example, 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Num to check Armstrong number: ");
        int num = in.nextInt();
        boolean ar = isArm(num);
        System.out.println(ar);

    }


    static boolean isArm(int n){
        int orignal = n;
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            int cube = rem * rem * rem;
            sum = sum + cube;
            n = n / 10;
        }
        return sum == orignal;     // Or if(sum == orignal){} return true;

    }
    
}
/*
To show armstrong numbers from this to this number
comment line5 to line9 instead of that write this
for(int i = 0; i<1000;i++){
            if(isArm(i)){                         0 to 1000
                System.out.println(i);;
            } 
}
*/