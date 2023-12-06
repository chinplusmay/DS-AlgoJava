
public class NofixedCol{
    public static void main(String[] args) {

        int[][] arrc = {
            {1,2,3,4},
            {1,3454},
            {1,2,45,56,2,23,3}

        };

        for (int r=0; r<arrc.length ;r++){
            for(int c=0; c < arrc[r].length ; c++){

                System.out.print(arrc[r][c] + " ");
            }
            System.out.println(" ");
        }
    }

}