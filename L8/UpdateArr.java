import java.util.Arrays;
public class UpdateArr{
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        System.out.println(Arrays.toString(arr));
        changeArr(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void changeArr(int[] i){
        i[0] = 100;
    }
}

// Arrays Are mutable Can be change