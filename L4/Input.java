import java.util.Scanner;
public class Input{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your rollno: ");
        int rollno = input.nextInt();
        System.out.print("Enter Your marks: ");
        float marks = input.nextFloat();
        System.out.print("Enter your Name: ");
        String name = input.next();
        System.out.println("Student Details: "+name+" " +rollno +" " +marks+" ");
        
    }
}    