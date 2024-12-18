package DSA.Begin;

public class Main {
    public static void main(String[] args) {
//       int salry =54211;
//       if(salry < 20000){
//           salry = salry+2000;
//       }else{
//           salry = salry+1000;
//       }
//
//        System.out.println(salry);

        System.out.println("++++++++++++++Loops++++++++++++++");

        for(int i=1; i<=5; i++){
            System.out.print(" "+i);
        }

//        Scanner scanner = new Scanner(System.in);
//                int n = scanner.nextInt();
//
//
//        for(int i=1; i<=n; i++){
//            System.out.print(" "+i);
//    }

        System.out.println("=================While==================");

        int n =1;
        while( n <= 5){
            System.out.print(" "+n);
            n++;

        }

        System.out.println("=================Do-While==================");
        int e =1;
        do{
            System.out.print(" "+e);
            e++;
        }while (e <5);




  }
}
