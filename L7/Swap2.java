public class Swap2 {
    public static void main(String[] args) {
        String name = "Kunal Kushwaha"; 
        changeName(name);
        System.out.println(name);
    }
    static void changeName(String naam) {
        naam = "Rahul Rana"; // Not modifying or changing the og string(kunal kushwaha) we are creating a new object here naam = "Rahul Rana"
    }
}

 /*  Swap 1 and 2 Will not Work in swaping as in java there is pass in Value only
    so only in fn scope it will work but the orignal value will not be changed */
 
    //see Swap2.png also