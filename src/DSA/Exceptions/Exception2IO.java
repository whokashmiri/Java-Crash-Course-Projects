package DSA.Exceptions;

import java.util.Scanner;

public class Exception2IO {
//    static int  []a = new int[5];
//
//    public static void main(String[] args) {
//        getNumber(a);
//        try {
//            System.out.println(a[9]);
//
//        }catch (Exception e){
//            System.out.println("Exception" +e.getMessage());
//        }
//    }

//    static int getNumber(int[] a) throws ArithmeticException{
//        return a[8];
//
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        try {
            if(age>120){
                throw  new MyExp("Age Should be Less Then 120 ");
        }

        }catch (Exception e){
            System.out.println(e);
        }

    }
    static class  MyExp extends Exception{
        public MyExp(String mesaage){
            super(mesaage);
        }

    }
}





