package DSA.Functions;

import java.util.Scanner;

public class Overloading {
//    static void fun(int a){
//        System.out.println(a);
//
//    }
//    static void fun(int a , String f ){
//        System.out.println(a + f);
////        System.out.println(f);
//
//    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isPrime(n));
//        fun(2);
//        fun(45 , "HEllo");
    }

    private static boolean isPrime(int n) {
        if(n<=1){
            return  false;
        }
        int c=2;
        while(c*c<=n){
            if(n*c == 0){
                return false;
            }
            c++;
        }
        return c*c>n;
    }


}
