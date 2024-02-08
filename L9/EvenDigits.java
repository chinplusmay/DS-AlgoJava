public class EvenDigits {
    //Best SOLUTION OF problem(No edge cases)
    // https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
    public static void main(String[] args){
        int[] arr = {12,45,15151,152};
        System.out.println("Even Digits in num of arr: "+EvenDig(arr));
    }

    static int EvenDig(int[] nums){
        int count = 0;
        for(int num : nums){
            if(EvenNum(num) == true){
                count ++;
            }
        }
        return count;
    }

    static boolean EvenNum(int num){
        return(Digits(num) % 2 == 0);
    }


    static int Digits(int num){
        int ncount = 0;                       
        if(num < 0){                  // If num is Negative : convert num to +ve
            num = num * -1 ;
        }

        if(num == 0){                 // If num is 0 then Digits(0) will return 0 but it is of 1 digit so to clear that case we use this edge case 
            return 1;
        }
        while(num > 0){
        
        num = num / 10;
        ncount ++;
    }return ncount;
    }

    // static int Digits(int num){                         // It is the best Digit funtion have best compelexity we learn about in future
    //     return (int) (Math.log10(num)) + 1;
    // }
    
}
