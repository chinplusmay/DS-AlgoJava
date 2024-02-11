public class BinarySearch{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,90,299,1777};
        int target = 6;
        int index = BinSearch(arr, target);
        System.out.println(index);
    }


    static int BinSearch(int[] arr, int trget){
        int start = 0;
        int end = arr.length - 1;


        while(start <= end){
            // Mid formula is changed bcoz (start+end) can exceed range of java int
            int mid = start + (end - start) / 2;


            if(trget > arr[mid]){                //{1,2,(3),4,'5',} start = mid+1
                start = mid + 1;
            }
            else if (trget < arr[mid]){                      
                end = mid - 1;
            }
            else{
                return mid;      // else : arr[mid] == target
            }

        }return -1;             

    }
}