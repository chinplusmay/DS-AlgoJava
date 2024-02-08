public class EvenDigitsRaw {
    //RAW SOLUTION OF problem(No edge cases)
    // https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
    public static void main(String[] args) {
        int[] arr = {15,154,4445,45};
        int ans = EvenDig(arr);
        System.out.println(ans);
        
    }
// main fn for checking that in array nums every number's digits is even or not
    static int EvenDig(int[] nums){
        int count = 0;
        for(int num : nums){
            if(Evennum(num) == true){
                count ++ ;
            }
        }
        return count; 
    }
// Check if No of digits in num is even or not and returning true/false
    static boolean Evennum(int num){
        if(Digits(num) % 2 == 0 ){
            return true;
        }
        return false;
    }

    static int Digits(int num){
        int ncount = 0;
        while(num > 0){
            num = num / 10;
            ncount ++;
        }
        return ncount;
    }
// second method for having the no of digits ex. num = 543 then digits are 3

    // static int Digits(int num){
    //     String str = num +"";
    //     int sn = str.length();       
        
    //     return sn;
    // }



}
