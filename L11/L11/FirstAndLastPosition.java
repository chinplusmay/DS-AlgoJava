import java.util.Arrays;
    // Lc Medium prob
    // https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/1176262577/

public class FirstAndLastPosition {
    public static void main(String[] args){
        int[] ans = {1,2,3,5,5,5,6,7};
        int target = 5;
        int[] a = FandL(ans,target);
        System.out.println(Arrays.toString(a));
    }


static int[] FandL(int[] arr , int target){
    int[] nums = {-1,-1};
    nums[0] = search(arr,target,true);
    if(nums[0] != -1){                                   // bcoz if nums[0] = -1 then obviously nums[1] also be = -1
        nums[1] = search(arr,target,false);
    }
    return nums;
}

static int search(int[] arr,int target,boolean findStartIndex){
    int ans = -1;   // initialize arr

    int start = 0;
    int end = arr.length - 1;

    while(start<=end){
        int mid = start + (end-start)/2;
        if(arr[mid] > target){
            end = mid - 1;
        }
        else if(arr[mid] < target){
            start = mid + 1;
        }
        else{
            // ans holds the potential(first value of index) at which target is ,the target can be at right or left side of the array
            ans = mid;
            if(findStartIndex == true){   // to check is target lies on the left side(start) 
                end = mid - 1;
            }
            else{                         // to check is target lies on the right side(end) 
                start = mid + 1;
            }
        }
    }return ans;
}
}