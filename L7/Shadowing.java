public class Shadowing {
    static int x = 123;  //this will be shadowed by line 6

    public static void main(String[] args) {
        System.out.println(x);
        int x;  // class variable at line 2 will be shadowed by this
        //System.out.println(x); scope will begin when value is initilized

        x = 90;
        System.out.println(x);
        fun();

    }
    static void fun(){
        System.out.println(x);
    }
}
