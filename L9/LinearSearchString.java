public class LinearSearchString {
    public static void main(String[] args) {
        
        String st = "Hello Boya ";
        char target = 'e';
        System.out.println(search2(st,target));
    }



    static boolean search1(String str, char trget){
        if(str.length() == 0 ){                         // using funtion length() here not length
                                                        // str.length() is for string and arr.length variable  is for int
            return false;
        }
        for(int i=0; i < str.length();i++ ){
            if(trget == str.charAt(i)){
                return true;
            } 
        }
        return false;
    }
    // for each method 
    static boolean search2(String str, char trget){
        if(str.length() == 0 ){
            return false;
        }
        for(char ch : str.toCharArray()){
            if(ch == trget){
                return true;
            }
        }
        return false;
    }
}
