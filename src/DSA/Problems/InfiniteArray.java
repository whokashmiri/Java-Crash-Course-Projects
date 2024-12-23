package DSA.Problems;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target =  5;

        System.out.println(range(arr , target ));

    }
    static int range(int[] arr , int target){
        int start = 0;
        int end = 1;
        while(target>arr[end]){
            int newStart=end+1;
            end=end+(end-start+1)*2;
            start= newStart;
        }
        return  infiniteArr(arr,target, start, end);
    }
    static int infiniteArr(int [] arr , int target ,int start , int end){
//        int start = 0;
//        int end = arr.length-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(target < arr[mid]){
                end = mid- 1 ;

            } else if (target > arr[mid] ) {
                start = mid+1;

            }
            else {
                return mid;
            }

        }

        return target;
    }
}
