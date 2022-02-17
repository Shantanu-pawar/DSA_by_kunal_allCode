package lec3_ArraysCode.LinearSearch_questions;

public class Q7_Find_minimumNo {
    public static void main(String[] args) {
//        find minimum number in the array

        int [] arr = {111, 21, 45, 78, 98 , 451, 123};
        System.out.println( "here is your minimum value : " +  minimum(arr));
    }
    static int minimum( int [] arr ){

         int ansMinimum = arr[0];

//         assume the arr.length != 0
        //return the minimum value in the array

        for (int i = 0; i < arr.length; i++) {
        if(arr[i] < ansMinimum ){

            ansMinimum = arr[i];

             }
        }
        return ansMinimum;
    }
}



