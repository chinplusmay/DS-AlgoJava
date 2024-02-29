class SearchInMountain {
    public static void main(String[] args){
        int[] arr = {1,2,4,3,1};
        int target = 3;
        int ans = Search(arr, target);
        System.out.println(ans);
           
    }

    static int Search(int[] arr, int target){
        int peak = peakIndex(arr);
        int FirstTry = orderAgnosticBS(arr, target, 0,peak);
        if(FirstTry != -1){
            return FirstTry;
        }
        else{
            int SecondTry = orderAgnosticBS(arr,target, peak+1 ,arr.length-1);
            return SecondTry;
        }
    }
    

   static int peakIndex(int[] arr){
    int start = 0;
    int end = arr.length - 1;
    while(start<end){
        int mid = start + (end-start)/2;

        if(arr[mid] < arr[mid+1]){
            start = mid + 1;
        }

        else{
            end = mid;
        }
    }return start;
   }


   static int orderAgnosticBS(int[] arr, int target, int start,int end){

    boolean IsAsc = arr[start] < arr[end];

    while(start<=end){
        int mid = start + (end-start)/2;


        if(arr[mid] == target){
            return mid;
        }

        if(IsAsc == true){

            if(arr[mid] < target){
             start = mid + 1;
            }
            else{
                end = mid - 1;
            }
            }    

            else{
                if(arr[mid] < target){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
    }return -1;
   }


























}
