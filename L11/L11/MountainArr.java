public class MountainArr{

    //med lc prob
    // https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
    //{1,2,4,5,6,4,3,1}  return max index of element 6

    public static void main(String[] args){
        int[] arr = {1,2,3,4,2};
        System.out.println("Index of Peak element is : " +peakIndexInMountainArray(arr));
    }



    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start<end){
            int mid = start + (end-start)/2;

            if(arr[mid] > arr[mid+1]){  // You are in descending order of mountain       ex{1,2,4,5,(6),4,3,1}
            // So max should exist in right it can only reside on the mid or left of it
                end = mid;
            }
            else{// a[mid] < a[mid+1]                       You are in ascending order of mountain           ex{1,2,(4),5,6,4,3,1} 
            // So max should exist in right side of the arr(it obviously will not exist on the mid or before it )
                start = mid+1;
            }
        }return start;     // can also return start as both start and end will be on the same element(max)
    }
}