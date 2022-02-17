package lec3_ArraysCode.lectures;
import java.util.Arrays ;
import java.util.Scanner;

public class ch2_PassingInFunctions {
    public static void main(String[] args) {
//

//        int [] nums = {3 ,34 ,655 ,35 };
//        System.out.println(ArraysPrint.toString(nums));
//        change(nums);
//        System.out.println(ArraysPrint.toString(nums));


// this is the array for userinput of the strings and change internally

        Scanner in = new Scanner(System.in);
        String [] str = new String[4];

        for (int i = 0; i < str.length ; i++) {
            str [i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        change(str);
        System.out.println(Arrays.toString(str));

    }

//    this function is for change in integer

//    static void change(int [] arr){
//        arr[2] = 99;

    //    this function is for change in array

    static void change(String [] arr){
        arr[3] = "RAndiRona";

    }
}
