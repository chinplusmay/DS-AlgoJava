import java.util.Scanner;
public class Greet {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();
        String kimi = Greet(name);
        System.out.println(kimi);



    }

    static String Greet(String n){
        String messege = "Hello" +" " +n;
        return messege;
    }

}
