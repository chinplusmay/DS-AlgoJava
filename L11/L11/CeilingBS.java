public class CeilingBS {

    // Ceiling of a no is : smallest no in arr which is Greater OR Equal to target    CF:CEIL -> return START
    public static void main(String[] args){
        int[] arr = {1,2,4,5,45,48,342,4443};
        int targetC =  46;
        int indexC = Ceil(arr, targetC);
        System.out.println(indexC);
    }

    static int Ceil(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

    // If the target is Greater than the greatest no in the array
        if(target > arr[end]){
            return -1;
        }
        

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
        }return start;
        
    }
}
