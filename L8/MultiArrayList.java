import java.util.Scanner;
import java.util.ArrayList;
public class MultiArrayList {
    // 2d array using ArrayList
    public static void main(String[] args) {
        
    
    Scanner in = new Scanner(System.in);

    ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    //initialization
    for(int i=0; i < 3; i++){
        list.add(new ArrayList<>());
    }

    //add elements
    for(int i=0; i < 3; i++){
        for(int j=0; j < 3; j++){
            list.get(i).add(in.nextInt());     // add to i(th) index 
        }
    }
    System.out.println(list);
}
}
