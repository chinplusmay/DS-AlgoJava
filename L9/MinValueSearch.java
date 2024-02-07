public class MinValueSearch {
    public static void main(String[] args){
        int[] arr = {1,15,51,-986,5412};
        System.out.println("Min value is: " + Min(arr));
    }

    static int Min(int[] a){
        int min = a[0];
        for(int i = 0;i<a.length ; i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        return min;
    }
}
