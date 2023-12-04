import java.util.Scanner;
public class IsPrime{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no to check prime: ");
        int num = in.nextInt();
        boolean prime = isPrime(num);
        System.out.println(prime);

    }

    static boolean isPrime(int num){        // explanation for this program is in lec6 flow of program//
        int c =  2;
        while(c*c <= num){                  // two ways -> (c*c <= nume) OR ( c<=sqrt(num) )  this is to reduce complexity otherwise it is (c<num) only //
            if (num % c == 0){
                return false;
            }
            c++;
        }return true;

    }
}