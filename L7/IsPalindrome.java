import java.util.Scanner;
public class IsPalindrome{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no to check Palindrome: ");
        int num = in.nextInt();
        boolean pld = isPald(num);
        System.out.println(pld);

    }

    static boolean isPald(int n){
        int org = n;
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            sum = sum*10 + rem;
            n = n/10;
        }
        return sum == org;
    }


}
