package DSA.Algorithm;

import java.util.Arrays;

public class Algo2BS2D {
    public static void main(String[] args) {
        int [][] arr={
                {10,20,30,40},
                {14,24 ,34 ,44},
                {20, 23,37,49},
                {33 ,38, 39,55}
        };
        System.out.println(Arrays.toString(search(arr,55)));
    }
    static int [] search(int [][] matrix , int target){
        int row = 0;
        int col = matrix.length-1;
        while (row< matrix.length && col>=0){
            if(matrix[row][col] == target){
                return new int[]{row, col};
            }
            if (matrix[row][col]<target){
                row++;
            }else {
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
