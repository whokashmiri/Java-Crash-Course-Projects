package DSA;

import java.util.Scanner;

public class Fibonocci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
//         while(count<=n){
//             int temp = b;
//             b =b+a;
//             a=temp;
//             count++;
//         }
        for ( count=2 ; count<=n ;count++){
            int temp =b; //1 1 /
            b=b+a; //1 2
            a=temp; //1 1
        }
        System.out.println(b);
    }
}
