public class Swap {                                    
    /*  Swap 1 and 2 Will not Work in swapping as in java there is pass in Value only
    so only in fn scope it will work but the orignal value will not be changed */
    
    public static void main(String[] args) {                         
        int a = 10;
        int b = 20;

        // swap numbers code
//        int temp = a;
//        a = b;
//        b = temp;

        swap(a, b);
        System.out.println(a + " " + b);
    }
   
    static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        // this change will only be valid in this function scope only.
    }
}