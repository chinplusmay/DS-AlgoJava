import java.util.Scanner;
public class Salary{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Salary: ");
        int sal = in.nextInt();
        if (sal >= 20000){
            sal += 1000;
        }
        else if (sal >= 30000){
            sal += 2000;
        }
        else{
            sal += 1000;
        }
        System.out.println("Your Salary is: " +sal);
    }
}