package DSA.Functions;

import java.util.Scanner;

public class Functions {
    static void sum(){
        Scanner scanner = new Scanner(System.in);
        int num1  = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum = num1+num2;
        System.out.println(sum);
    }
    public static void main(String[] args) {
     sum();
    }
}
