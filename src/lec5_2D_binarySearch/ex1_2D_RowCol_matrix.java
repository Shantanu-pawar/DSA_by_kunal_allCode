package lec5_2D_binarySearch;

import java.util.Arrays;

public class ex1_2D_RowCol_matrix {
    public static void main(String[] args) {

//        this is only work in sorted but not like sequencing array
//        lets see ex about this in next ex.

        int [][] arr = {
                {10, 22, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        System.out.println(Arrays.toString(search(arr, 49)));
        }

    static int []search (int [][]matrix ,int target){
        int r = 0;
        int c = matrix.length -1 ;

        while (r < matrix.length && c >=0) {
            if (matrix[r][c] ==target){
                return new int [] {r ,c};
            }
            if(matrix[r][c] < target){
                r++;
            }else{
                c--;
            }
        }
        return new int[] {-1 ,-1};
    }
}

