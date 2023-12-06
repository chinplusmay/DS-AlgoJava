public class MaxArr {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,32,124,6};
        System.out.println(Max(arr));
        System.out.println(MaxRng(arr,2,4));
    }
    static int Max(int[] a) {
        int Mx = a[0];
        for(int i = 1; i < a.length ; i++){           // Start loop from 1 as 0th index is assigned to Mx so we start from 1th element
            if(a[i]> Mx){
                Mx = a[i];
            }
        }
    return Mx;
    }

    
    // For Max in some range like what is max value form 0 to 3rd index

    static int MaxRng(int[] a, int strt , int end){
        int Mrx = a[strt];
        for (int i = strt; i<=end ; i++){
            if(a[i] > Mrx){
                Mrx = a[i];
            }
        }
    return Mrx;    
    }
}
