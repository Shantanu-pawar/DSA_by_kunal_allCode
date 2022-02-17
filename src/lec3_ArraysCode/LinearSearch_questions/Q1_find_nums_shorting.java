package lec3_ArraysCode.LinearSearch_questions;

public class Q1_find_nums_shorting {
    public static void main(String[] args) {

        int[] arr = {23, 78,1, 3, 4, 5, 54, 45, 64, 456, 451};
        int target = 45;

        int ans = linearSearch(arr, target);
        System.out.println(ans);

    }

   /*
linear search :
search the array - return the index if item found
otherwise if item not found return -1
 */

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
//            run for loop now

        for (int num = 0; num < arr.length; num++) {

//            check for the elements at every index
            int element = arr[num];
            if (element == target) {
                return num;
            }
        }
//        this line will execute if none of the return startements
        // have executed hence target not found

        return -1;
    }
}



