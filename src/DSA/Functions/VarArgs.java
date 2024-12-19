package DSA.Functions;

import java.util.Arrays;

public class VarArgs {
    static  void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    public static void main(String[] args) {
        fun(5,4,8,7,6);
    }
}
