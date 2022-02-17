package lec3_ArraysCode.lectures;

import java.util.Scanner;
import java.util.Arrays;

public class ch3_MultiDimentionArrays {
    public static void main(String[] args) {


//        add no of columns and rows
        Scanner in = new Scanner(System.in);

        int [] [] arr= new int[3][3];
        System.out.println(arr.length); // basically here arr is varible you can choose anything over it


//        input
        for(int row = 0 ; row < arr.length ; row ++){
//            for each column in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
//            output

//        for(int row = 0 ; row < arr.length ; row ++){
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println(); // this is for just print in the box formating
//        }

        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));// this is just another shortcut method for print
        }

    }
}
