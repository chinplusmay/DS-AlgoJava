public class FloorBS {
    //Floor of a no is: greatest no in arr Smaller or Equal to the Target     FE:FLOOR -> return END
    public static void main(String[] args){
    int[] arr = {1,2,4,5,45,48,342,4443};
    int targetF =  46;
    int indexF = Floor(arr, targetF);
    System.out.println(indexF);
    }



    static int Floor(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;

        //If the target is less than the smallet no in arr
        // in floor code no need to write anything as it automatically return -1 when above statement is becomes true

        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] > target){
                end = mid - 1;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }return end;
    }
}
