package DSA.Functions;

import java.util.Arrays;

public class changeValue {
    static void chnge (int [] muns){
        muns[0]=1;
    }

    public static void main(String[] args) {
        int arr[] ={9,8,7};
        chnge(arr);
        for(int i =0 ; i<=arr.length-1; i++){
            System.out.println(arr[i]);
        }


    }
}
