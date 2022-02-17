package lec3_ArraysCode.LinearSearch_questions;

import java.util.Arrays;

public class Q5_SearchInTwo_D_array {
    public static void main(String[] args) {
        int [][]arr = {
                {12 ,32, 1},
                {18 ,78, 56, 45},
                {72, 45, 65, 98},
                {17, 8}
        };
        int target = 98;

        int [] ans = search(arr ,target);
//        this is for the format which contains the {row , col}
        System.out.println(Arrays.toString(ans));

    }
    static int [] search(int[] [] arr, int target){

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {

                if (arr [row][col] == target){
                    return new int[]{row ,col};
                }
            }
        }
        return new int[]{-1 ,-1};
    }
}
