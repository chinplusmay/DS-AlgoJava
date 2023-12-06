import java.util.Arrays;
public class SwapArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4};
        System.out.println(Arrays.toString(arr));
        int[] sw = swap(arr , 3 , 4 );
        System.out.println(Arrays.toString(sw));
       
    }
    static int[] swap(int[] a , int indx1 , int indx2){
        int temp = a[indx1];
        a[indx1] = a[indx2];
        a[indx2] = temp;
        return a;
    }
}

//  int[] arr = {1,3,4,3,2,5};
//         System.out.println(Arrays.toString(arr));
//         swap(arr, 1, 2);
//     }
//     static void swap(int[] a , int index1 , int index2) {
//         int temp = a[index1];
//         a[index1] = a[index2];
//         a[index2] = temp;
//         System.out.println(Arrays.toString(a));
//     }
    