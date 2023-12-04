import java.util.Scanner;
public class Sumfn2 {                        // This is argument version of Sumfn//
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int num1 = in.nextInt();
        System.out.print("Enter the number2: ");
        int num2 = in.nextInt();
        int Summation =Sum(num1,num2);
        System.out.println("The sum is: " +Summation);

    }

    static int Sum(int n1, int n2){
        int sum = n1 + n2;
        return sum;
    }

}
