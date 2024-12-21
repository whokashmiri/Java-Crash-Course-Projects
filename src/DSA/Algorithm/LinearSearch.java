package DSA.Algorithm;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {5,6,3,4,6};
        if(arr.length <= 0){
            System.out.println("Empty Array");
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] ==4){
                System.out.println(i +" "+arr[i]);
            }

        }
    }
}
