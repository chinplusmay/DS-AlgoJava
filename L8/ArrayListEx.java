import java.util.ArrayList;
public class ArrayListEx{
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>(4);     //the initial capacity is variable we actually give elements more than 10
        
        list.add(12);     // to add a element in the array(list) Syntx: list.add(elemnt) and you can add as many elements as you want
        list.add(1213);
        list.add(11121);
        list.add(134);
        list.add(3242);
        list.add(23);
        System.out.println(list.contains(134));        // true if the arraylist contains the given element
        System.out.println(list);
        
        list.set(1,333);                  // to update the list elements:  list.set(index,value)
        list.remove(3);                          // remove the element from the list elements: list.remove(index)
        System.out.println(list.get(0));         // to get element at any index: list.get(index)

        System.out.println(list);
        



    }
}
