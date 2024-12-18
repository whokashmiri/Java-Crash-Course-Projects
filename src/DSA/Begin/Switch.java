package DSA.Begin;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fr = scanner.next();
       String fruit = fr.toLowerCase();
        switch (fruit){
            case "mango":
                System.out.println(fruit);
                break;
            case "apple":
                System.out.println(fruit);
                break;
            case "apricot":
                System.out.println(fruit);
                break;
            default:
                System.out.println("No Case");
        }


        switch (fruit){
            case "mango":
            case "apple":
            case "apricot":
                System.out.println(fruit);
                break;
            default:
                System.out.println("No Case");
        }


        switch (fruit) {
            case "mango"-> System.out.println("Mango");
            case "apple" -> System.out.println("Apple");
            case "apricot" -> System.out.println("Apricot");
            default ->   System.out.println("No Case");

        }
    }
}
