public class Scope{
    public static void main(String[] args){ 
        //P.S     declared -> int a;   initialize -> a = 13;   updated -> a = 123;    all in same block
        // What is declared outside the block it cannot be declared inside the block but can be updated or initialized
        // What is declared inside the block can be declared outside the block ex line 8 and line 12
        
        {
           int a = 12342;
            System.out.println(a);
        }
        
    int a = 123; 
    System.out.println(a);

        {
            System.out.println(a);
        }
    }
}