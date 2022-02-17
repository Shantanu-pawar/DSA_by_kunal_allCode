package lec3_ArraysCode.LinearSearch_questions;

public class Q3_Search_In_Arrays {
    public static void main(String[] args) {

        int[] arr = {12, 54, 78, 73 , 451 ,44 ,4};
        int target = 54;
        System.out.println(linearSearch(arr , target , 0 , 6));
    }
    static  int linearSearch (int [] arr , int target , int start , int end){
        if (arr.length == 0){
            return -1;
        }

        for (int num = start; num <= end; num++) {
            int element = arr[num] ;


            if (element == target){
                return num ;
            }
        }
        return -1;
    }
}
