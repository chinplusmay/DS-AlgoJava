import java.util.Scanner;

public class Occurance{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in); 
        System.out.print("Enter number: ");
        int num = inp.nextInt();
        System.out.print("Which digit's occurance: ");
        int digi = inp.nextInt();
        int count = 0;

        while(num > 0){
            int rm = num % 10;                     // Any no which is divided by 10 the remainder of it will be last digit of the number given//
            if(rm == digi){                        // 111132 % 10 = 2 (last digit) //
                count++;
            }

            num = num/10;                          // here num/10 is acting like floor division(ignoring the decimals) here we are deleting the digits from the end//
        }                                         // like 12345/10 = 1234 (5 is deleted as it is decimal)   //           
        
        System.out.println(count);

    }
}
