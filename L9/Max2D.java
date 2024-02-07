public class Max2D {
    public static void main(String[] args){

        int[][] arrr = {
            {43,2134,425,3114},
            {-422,245,2325},
            {344,242,442,53685}
        };
        System.out.println("Max value is : "+ Max(arrr));
    }


    static int Max(int[][] ar){
        int max = ar[0][0];
        // int max = Integer.MAX_VALUE; can use this also now max is = to lowest value in java 
        for(int r=0; r<ar.length;r++){
            for(int c=0;c<ar[r].length;c++){
                if(ar[r][c] > max){
                    max = ar[r][c];
                }
            }
        }
        return max;
    } 
}
