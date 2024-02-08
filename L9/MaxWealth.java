public class MaxWealth {
    // Problem maximum wealth
    // https://leetcode.com/problems/richest-customer-wealth/
    public static void main(String[] args){
        int[][] arr = {
            {1,2,3},
            {2,4,5},
            {6,7,8}
        };
        System.out.println(Maxmon(arr));
    }


    static int Maxmon(int[][] Bank){
        int ans = 0;
        for(int per =0; per<Bank.length;per++){
            int rowsum = 0;
            for(int bill = 0;bill<Bank[per].length;bill++){
                rowsum = rowsum + Bank[per][bill]; 
            }

            if(rowsum > ans){
                ans = rowsum;
            }
        }return ans;
    }
}
