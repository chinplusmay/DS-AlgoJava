import java.util.Scanner;

public class Sumfn {
    public static void main(String[] args) {
        int Sum = sum();
        System.out.println("Sum =  "+ Sum);

    }
    

    static int sum(){                                       // if the return type is Integer then it should definitely return Integer//
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int n1 = in.nextInt();
        System.out.print("Enter the number2: ");
        int n2 = in.nextInt();
        int sum = n1 + n2;
        return sum;
    }
}
