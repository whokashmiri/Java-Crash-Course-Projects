package DSA.Functions;
//no pass by reference only pass by value
public class Swap {
    static  void sweep(){
        int a=43 ;
        int b =21;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a:"+a +" " +"b:"+ b);
    }
    public static void main(String[] args) {

        sweep();

    }
}
