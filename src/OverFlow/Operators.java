package OverFlow;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
//        Operators -+*/
        int a =1;
        int b =3;
        System.out.println(a+b);

         int pre = 1;
         pre++;
        System.out.println(++pre);
        System.out.println(pre);
//MATHS
        System.out.println(Math.max(2,5));
        System.out.println(Math.min(2,5));
        System.out.println(Math.floor(Math.random()*10));
//        Scanner


        Scanner scanner = new Scanner(System.in);
        int price = (int) scanner.nextFloat();
        System.out.println(price);

        //COMPARISON OPERATORS
        int t =5 ; int u = 5;
        System.out.println(t==u);
        if(a<=b){
            System.out.println("value of"+a);
        }

    }
}
