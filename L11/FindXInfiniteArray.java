public class FindXInfiniteArray{
// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
    public static void main(String[] args){
        int[] arr = {1,2,2,3,4,5,6,7,7,9,10,21,32,43,53,63,68}; // let this be infi array so we cant use arr.length fn here
        int target = 21;
        System.out.println(StartEndChunk(arr, target));
    }
    
    static int StartEndChunk(int[] arr,int target){
        int start = 0;
        int end = 1;
        while(target > arr[end]){       //arr={1,2,(3,4),5,6,7} end=3(4)  trget=6  
            int NewSrt = end + 1; 
          //end = prev end + (size of box/chunk)*2
          end = end + (end - start + 1)*2;
          start = NewSrt;
        }
        
        return BinarySearch(arr, target, start, end);
    }




    static int BinarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid]<target){
                start = mid + 1;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                return mid;
            }

        }return -1;

    }
}