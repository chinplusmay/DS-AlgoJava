public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,4,22,32,4234,452,32,314,544454,-21,3,-322};
        int target = 32;
        int indx = linearsrch(arr , target);
        boolean found = linearsrch2(arr, target);
        System.out.println("Index of target is : " + indx);
        System.out.println(found);
    }


    // reuturn the index of the target
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

        
    // true false is target is really in the array
    static boolean linearsrch2(int[] a , int trget){
        for(int n : a){
            if(n==trget){
                return true;
            }
        }
        return false;
    }    
    }
