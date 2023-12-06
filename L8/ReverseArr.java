import java.util.Arrays;
public class ReverseArr {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,4};
        System.out.println(Arrays.toString(arr));
        int[] rev = reverse(arr);
        System.out.println(Arrays.toString(rev));
    }

    static int[] swap(int[] a, int start, int end ){
        int temp = a[start];
        a[start] = a[end];
        a[end] = temp;
        return a;
    }

    static int[] reverse(int[] a){
        int start = 0;
        int end = a.length - 1;
        while(start<end){
            swap(a,start,end);                     // {1,3,4,5,6,4} = a
            start++;                               // strt=a[0]=1       end=a[a.length-1]= 4
            end--;
        }
        return a;
    }
}
