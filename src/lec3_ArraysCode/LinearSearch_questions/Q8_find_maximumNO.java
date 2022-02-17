package lec3_ArraysCode.LinearSearch_questions;

public class Q8_find_maximumNO {
    public static void main(String[] args) {
        int [] arr = {12, 13, 15, 18, 19, 21, 22, 25 , 29, 32};
        int ans = maximum(arr);
        System.out.println(ans);
    }
    static int maximum(int [] arr ){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] > max){
                max = arr[i];

            }

        }
        return max;
    }

}
