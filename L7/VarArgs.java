import java.util.Arrays;
public class VarArgs {
    public static void main(String[] args) {
        
        var(3,4,3,2,42,13,4,244,313); // This will take any number of arguments as the datatype in sysntax(here int) and store in a array[]

    }

    static void var(int ...v){               // v is name of the variable we can name it anything  
        System.out.println(Arrays.toString(v));

    }
    //<datatype>...<variable name> syntax for Variable length arguments(Varargs...)

    static void multiple(int a, int b, String ...m){
        System.out.println(Arrays.toString(m));              //Arrays.toString only works when import java.util.Arrays//
    }
    // In case when we want arguments of various types normal and keyword arguments this is sytax
    // fn(<datatype> var, <datatype> var <datatype>  ...<variable name>){}
    //        normal         normal                keyword arguments
    
}

