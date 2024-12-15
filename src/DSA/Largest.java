package DSA;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int max = a;
        if(b>max){
            max=b;
        }if(c>max){
            max = c;
        }
        System.out.println("The Largest Is : " +max);
    }
}
