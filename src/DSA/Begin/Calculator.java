package DSA.Begin;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ans = 0;
        while(true){
            char op = scanner.next().trim().charAt(0);
            if(op == '+' || op== '-' || op== '*'  || op == '/' ||op == '%')
            {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                 if (op == '+'){
                     ans = a+b;
                 }
                if (op == '-'){
                    ans = a*b;
                }
                if (op == '*'){
                    ans = a*b;
                }
                if(op== '/' ){
                    if(b!=0)
                    {
                        ans = a/b;
                    }

                }
                if(op == '%'){
                    ans = a%b;
                } else if (op == 'X' ||op == 'x') {
                    break;
                }else {
                    System.out.println("Invalid Operator");
                }



        }
            System.out.println(ans);
}

    }
}
