import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
       /* char ch = in.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z'){                               For First letter only 
            System.out.println("lower case");
        }
        else {
            System.out.println("upper case");*/
        
        
        String str = in.next().trim();
        for (int i = 0; i < str.length(); i++) {                       
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {        // to check each and every letter in a string//
                System.out.println("lower case");
            } else {
                System.out.println("upper case");
            }
        }
    }
}
