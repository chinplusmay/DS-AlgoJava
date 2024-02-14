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
        else{
            start = mid + 1;
        }
    
    } return(arr [start % N]);
}
}
// Ex 1
// Start % arr.length = 
// letters = ["c","f","j"], target = "c"    N = 3
//             s   m    e
//                 m.s   e
//                m.s.e
//             e   m.s                 end<start voileted whileloop
// letters[s % N] == 1 % 3 == 1 ,1 will be returned]

//Ex 2
// letters = ["x","x","y","y"], target = "z"    N = 4
//             s   m       e
//                    s.m   e
//                         s.m.e
//                           m.e   s(=4)               end<start voileted whileloop

// letters[s % N] == 4 % 4 == 0 ,0 will be returned]


