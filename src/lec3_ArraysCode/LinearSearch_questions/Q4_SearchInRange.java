package lec3_ArraysCode.LinearSearch_questions;

public class Q4_SearchInRange {
    public static void main(String[] args) {
/*
ques  : find the number in the array and we have to decide that what is start and end ?
        in that perticular array
 */

        int [] arr = {18 , 12 ,7 ,78, 3 ,654, 78};
        int target = 7;

        System.out.print("this will tell you that the index numbers your int stores :      ");
        System.out.println(linearSearch(arr , target , 3 , 4));

    }
    static int linearSearch(int[] arr, int target , int start , int end) {
        if (arr.length == 0) {
            return -1;
        }
//            run for loop now
        for (int num = start; num <= end; num++) {
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
