public class OrderAgnosticBS {
    public static void main(String[] args){
        //int[] arr = {1,2,3,4,5,6,7,8,9,11,22,33};
        int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int target = 75;
        int ans = oabs(arr,target);
        System.out.println(ans);
    }


    static int oabs(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;
        boolean IsAsc = arr[start] < arr[end];

        while(start <= end){

            int mid = start + (end - start)/2;
            
            //general for both
            if(arr[mid] == target){
                return mid;
            }

            if(IsAsc == true){
                if(target < arr[mid]){
                    end = mid - 1;
                }
            
                else{
                    start = mid + 1;
                }
            }
            else{
                if ( target > arr[mid]) {
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
              
        }
        return -1; 
    }
}
