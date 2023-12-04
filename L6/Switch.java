import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a fruit: ");
        String fruit = inp.next();

        // switch (fruit){
        //     case "Apple":
        //         System.out.println("Sweet");
        //         break;
        //     case "Orange":
        //         System.out.println("Tangy");
        //         break;
        //     case "Grapes":
        //         System.out.println("Small sour");
        //         break;
        //     case "Mango":
        //     case "Alphonso":
        //         System.out.println("Sweet King");
        //         break;
            
        //         default:
        //             System.out.println("Please enter a common/valid fruit");  

        // }

        switch(fruit){

            case "Apple"  -> System.out.println("Sweet");                         //This is "Enhanced Switch" auto break after each case and its looks clean//
            case "Orange" -> System.out.println("Tangy");
            case "Grapes" -> System.out.println("Small sour");
            case "Mango","Alphonso"  -> System.out.println("Sweet King");
            default -> System.out.println("Please enter a common/valid fruit");
        }      
    }

}
