import java.util.Scanner;

public class NestSwitch{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);      
        System.out.print("Enter empid");
        int empid = inp.nextInt();
        String department = inp.next();

        switch(empid){
            case 1:
                System.out.println("Cd");
                break;
            case 2:
                System.out.println("Manu");
                break;
            case 3:
                System.out.println("input 3");
                switch(department){
                    case "IT":
                        System.out.println("Bs");
                        break;
                    case "Management":
                        System.out.println("Bv");
                        break;
                    default:
                        System.out.println("Invalid Department");
                        break;
                }
                break;
            default:
                System.out.println("Invalid Empid");      
        }
    }

}