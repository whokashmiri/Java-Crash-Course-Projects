package DSA.Problems;

public class CountRotation {
    public static void main(String[] args) {
        int arr []= {6,7,8,9,3,4,5};
        System.out.println(countRotations(arr));
    }

     static int countRotations(int[] arr) {
        int pivot =pivot(arr);

         return pivot+1;
     }
    static  int pivot(int[] arr){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end -start)/2;
            if(mid<end && arr[mid]> arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return  mid-1;
            }
            if(arr[mid] <=arr[start]){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return -1;
    }
}
