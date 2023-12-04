import java.util.Arrays;
public class ChangeValue {
    public static void main(String[] args){

        int[] arr = {1,4,34,22};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void change(int[] nums){ 
        nums[0] = 99;      // if you make a change to the object via this ref variable, same object will be changed
    }
}

//in Swap2 We were not modifying the string but here we are modifying the int array (nums[] = 99;)