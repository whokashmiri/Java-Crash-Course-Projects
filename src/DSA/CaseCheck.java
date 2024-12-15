package DSA;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Character");
        char ch = scanner.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lower case");
        }else{
            System.out.println("Upper case");
        }
    }
}
