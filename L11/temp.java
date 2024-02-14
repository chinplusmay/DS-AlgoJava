public class SmallestLetter {
    // Lc easy prob
    // https://leetcode.com/problems/find-smallest-letter-greater-than-target/

    public static void main(String[] args){
        char[] letters = {'x','x','y','y'};
        char target = 'z';
        System.out.println(SmallestLetter(letters, target));
    }  

    static char SmallestLetter(char[] arr, char target ){
    int start = 0;
    int end = arr.length - 1;
    int N = arr.length; // {'a','b','c','d' _ } N = 5, N is for condition of (wrap around) given in lc problm as start will reach after 'd' at index 5 which is == N

    while(start <= end){
        int mid = start + (end - start) / 2;
        if(arr[mid] > target){
            end = mid - 1;
        }
        else if(arr[mid] < target){
            start = mid + 1;
        }

        else{
            if(start == N){
                return arr[0];
            }    
            // OR just
            //return(arr [start % N] ;)
        }
    }return arr[start];
}
}
