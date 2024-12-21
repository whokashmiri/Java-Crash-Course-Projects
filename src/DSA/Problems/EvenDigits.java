package DSA.Problems;

public class EvenDigits {
    static int findNumbers(int [] nums){
        int count =0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

     static boolean even(int nums) {
        int numOfDigits = digits(nums);
            if(numOfDigits % 2 ==0){
                return true;
            }

         return false;
    }
    static  int digits(int nums){
        int count =0;
        while(nums>0){
            count++;
            nums = nums/10;
        }
        return count;
    }

    public static void main(String[] args) {
        int [] arr = {32,4,48,90,59};
        System.out.println(findNumbers(arr));


    }
}
