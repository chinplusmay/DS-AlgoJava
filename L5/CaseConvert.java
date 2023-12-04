

/*  In C/C++ strings are Mutable but in Java it is immutable
 
So This Code will Not Run it was a Failure */






import java.util.Scanner;
public class CaseConvert{                            
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.next().trim();
        int len = str.length(); 
        for (int i = 0; i < len; i++){
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                str.charAt(i) = str.charAt(i) - 32;
            }
        }
        System.out.println(str);
    }
}

