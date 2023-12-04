import java.util.Arrays;
public class Overloading{
    public static void main(String[] args) {
        // When there are funtions(methods) of same name or same returntype but different type of arguments How they are get exucuted
        
        over(2,3);
        // can input all types in line 7
        // Whatever type of argument(s) you will input in over(here) that function will be called and executed
        // over(1)-> line 11 executed, over(21,4)-> line 15 executed, over("HEllo")-> line 20 executed
        // And this happens at compile time it decides that this fn will run
    }

    static void over(int a){
        System.out.println("First is executed");
        System.out.println(a);
    }

    static void over(int a,int b){
        System.out.println("Second is executed");
        int z = a + b; 
        System.out.println(z);
    }

    static void over(String name){
        System.out.println("Third is executed");
        System.out.println(name);
    }
    static void over(String ...v){
        System.out.println("Fourth is executed");
        System.out.println(Arrays.toString(v));
    }
     static void over(int ...v){
        System.out.println("Fifth is executed");
        System.out.println(Arrays.toString(v));
    }

}    