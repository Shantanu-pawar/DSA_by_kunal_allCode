package lec3_ArraysCode.lectures;

public class que_max {
    public static void main(String[] args) {

        /*
        question:1. find the max number within this given loop
        question:2. find the max number between the loop like 33 to 7 in below example

         */

        int [] arr = {1, 33, 4, 55, 7};
        System.out.println(max(arr) );

        }

//        imagine that array is not empty
     static int max(int[] arr) {
        int maxval = arr[0];
         for (int i = 0; i <arr.length ; i++) {
             if (arr[i] > maxval){
                 maxval = arr[i];
             }
         }
         return maxval;


    }
}

