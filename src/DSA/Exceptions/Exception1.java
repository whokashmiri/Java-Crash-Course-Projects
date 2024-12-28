package DSA.Exceptions;

public class Exception1 {
    public static void main(String[] args) {
        int  []a = new int[5];
          try {
              System.out.println(a[6]);

          }catch (ArrayIndexOutOfBoundsException e ){
              System.out.println("Length of Array 5");
          }
        System.out.println("Exception Handled");

          try {
              System.out.println(a[7]);
          }catch (Exception exception){
              System.out.println("Exception");

          }finally {
              System.out.println("From Finally");
          }
    }
}
