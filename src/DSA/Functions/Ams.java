package DSA.Functions;

public class Ams {
    static boolean isArms(int n){
        int ori = n;
        int sum = 0;
        while (n>0){
            int rem = n%10;
            n =n/10;
            sum = sum + rem*rem*rem;
        }
        return sum== ori;
    }
    public static void main(String[] args) {
//        System.out.println(isArms(153));
        for (int i = 100; i < 1000; i++) {
        if(isArms(i)){
            System.out.println(i);
        }

        }
    }
}
