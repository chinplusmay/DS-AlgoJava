public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,4,22,32,4234,452,32,314,544454,-21,3,-322};
        int target = 1;
        int indx = linearsrch(arr , target);            // boolean indx = linearsrch3(arr , target,1,3);
        boolean found = linearsrch2(arr, target);
        System.out.println("Index of target is : " + indx);
        System.out.println(found);
    }


    // return the index of the target
    static int linearsrch(int[] a , int trget){
        if (a.length == 0){
            System.out.println("Array is Empty" );
            return -1;
        }
        
        for(int index = 0; index < a.length; index++){
            if(a[index] == trget){
                return index;
            }
        }
        System.out.println("target not found");
        return -1;
            
        }

        
    // true false if target is really in the array
    static boolean linearsrch2(int[] a , int trget){
        for(int n : a){
            if(n==trget){
                return true;
            }
        }
        return false;
    }
    // Seearch element within a range
    static boolean linearsrch3(int[] a , int trget,int start,int end){
        for(int i = start ; i <= end; i++){
            if(a[i] == trget){
                return true;
            }
        }
        return false;    
    }
}